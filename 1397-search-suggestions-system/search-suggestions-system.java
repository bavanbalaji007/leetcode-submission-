class Trie{
    Trie[] chars=new Trie[26];
    String word;
}
class Solution {
    public void build(Trie t,String word,int idx){
        int ch=word.charAt(idx)-'a';
        if(t.chars[ch]==null){
            t.chars[ch]=new Trie();
        }
        
        Trie curr=t.chars[ch];
        if(idx==word.length()-1){
            curr.word=word;
            return;
        }
        build(curr,word,idx+1);
        
    }
    public Trie searchroot(Trie t,String word,int idx){
        if(idx==word.length()){
            return t;
        }

        int ch=word.charAt(idx)-'a';
        if(t.chars[ch]==null) return null;
       return searchroot(t.chars[ch],word,idx+1);
    }
    public void wordsearch(Trie t,List<String> a){
        if(t.word!=null){
            a.add(t.word);
        }
        for(int i=0;i<26;i++){
            if(a.size()==3) break;
            if(t.chars[i]==null) continue;
            wordsearch(t.chars[i],a);
        }
    }
    public List<List<String>> suggestedProducts(String[] products, String sw) {
        Trie root=new Trie();
        for(String s:products){
            build(root,s,0);
        }
        List<List<String>> ans=new ArrayList<>();
        for(int i=0;i<sw.length();i++){
            String word=sw.substring(0,i+1);
            Trie wr=searchroot(root,word,0);
            List<String> a=new ArrayList<>();
            if(wr==null){
                ans.add(a);
                continue;
            }
            wordsearch(wr,a);
            ans.add(a);
        }
        return ans;

    }
}