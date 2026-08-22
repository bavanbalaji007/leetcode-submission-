class Trie{
    String word;
    Trie[] chars=new Trie[26];
}
class Solution {
    int[] dir={-1,0,1,0,-1};
    List<String> ans=new ArrayList<>();
    public void buildTrie(Trie p, String word,int idx){
        int chidx=word.charAt(idx)-'a';
        
        if(p.chars[chidx]==null){
           p.chars[chidx]=new Trie();
        }
        Trie curr=p.chars[chidx];
        if(idx==word.length()-1){
            curr.word=word;
            return;
        }
        buildTrie(curr,word,idx+1);
     }
    public void dfs(int cr,int cc,char[][] board,boolean[][] vis , Trie t,int R, int C){
        int chidx=board[cr][cc]-'a';
        if(t.chars[chidx]==null) return;
        Trie curr=t.chars[chidx];
        if(curr.word!=null){
            ans.add(curr.word);
            curr.word=null;
        }
        vis[cr][cc]=true;
        for(int i=0;i<4;i++){
            int adr=cr+dir[i],adc=cc+dir[i+1];
            if(adr>=0 && adr<R && adc>=0 && adc<C && !vis[adr][adc]){
                dfs(adr,adc,board,vis,curr,R,C);
            }
        }
        vis[cr][cc]=false;

    }
    public List<String> findWords(char[][] board, String[] words) {
        Trie root=new Trie();
        
        for(String s:words ){
            buildTrie(root,s,0);
        }
        int R=board.length;
        int C=board[0].length;
        boolean[][] vis=new boolean[R][C];
        for(int r=0;r<R;r++){
            for(int c=0;c<C;c++){
                dfs(r,c,board,vis,root,R,C);
            }
        }
        return ans;
    }
}