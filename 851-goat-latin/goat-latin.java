class Solution {
    private boolean vowel(char ch){
        return 'a'==ch||'e'==ch||'i'==ch||'o'==ch||'u'==ch;
    }
    public String toGoatLatin(String sentence) {
        StringBuilder res=new StringBuilder();
        StringBuilder ma=new StringBuilder("maa");
        for(String str:sentence.split("\\s+")){
            if(vowel(Character.toLowerCase(str.charAt(0)))){
                res.append(str);
                res.append(ma);
            }else{
                res.append(str.substring(1));
                res.append(str.charAt(0));
                res.append(ma);
            }
            res.append(" ");
            ma.append("a");

        }
        return res.toString().trim();
    }
}