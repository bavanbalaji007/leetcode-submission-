class Trie {
    Trie[] chars=new Trie[26];
    String word;
    public Trie() {    
    }
    
    public void insert(String word) {
        int ch=word.charAt(0)-'a';
        if(chars[ch]==null) chars[ch]=new Trie();
        Trie curr=chars[ch];
        for(int i=1;i<word.length();i++){
            int c=word.charAt(i)-'a';
            if(curr.chars[c]==null){
                curr.chars[c]=new Trie();
            }
            curr=curr.chars[c];
        }
        curr.word=word;

        
    }
    
    public boolean search(String word) {
        int ch=word.charAt(0)-'a';
        Trie curr= chars[ch];
        if(curr==null) return false;
        for(int i=1;i<word.length();i++){
            int c=word.charAt(i)-'a';
            if(curr.chars[c]==null) return false;
            curr=curr.chars[c];
        }
        return curr.word!=null;

    }
    
    public boolean startsWith(String word) {
        int ch=word.charAt(0)-'a';
        Trie curr= chars[ch];
        if(curr==null) return false;
        for(int i=1;i<word.length();i++){
            int c=word.charAt(i)-'a';
            if(curr.chars[c]==null) return false;
            curr=curr.chars[c];
        }
        return true;

    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */