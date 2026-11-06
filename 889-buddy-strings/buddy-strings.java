class Solution {
    public boolean buddyStrings(String s, String goal) {
        if(s.length()!=goal.length()) return false;
       boolean[] b1=new boolean[26];
       int ff=-1,sec=-1;
       boolean f=false;
       for(int i=0;i<goal.length();i++){
        char ch1=s.charAt(i);
        char ch2=goal.charAt(i);
       
        if(b1[ch1-'a']) f=true;
        b1[ch1-'a']=true;
        if(ch1!=ch2){
            if(ff==-1)ff=i;
            else if(sec==-1) sec=i;
            else return false;
        }
       }

        if(ff==-1) return f;
        return sec!=-1 && s.charAt(ff)==goal.charAt(sec) && s.charAt(sec)==goal.charAt(ff);
    }
}