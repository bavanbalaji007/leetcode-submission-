class Solution {
    public int minOperations(String s) {
       
        boolean sorted=true;
        char max='a',min='z';
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>max) max=ch;
            if(ch<min) min=ch;
            if(i==0) continue;
            if(ch<s.charAt(i-1)) sorted=false;
        }
        if(sorted) return 0;
         if(s.length()==2) return -1;
        if(s.charAt(0)==min ||s.charAt(s.length()-1)==max) return 1;
        int c1=0,c2=0;
        for(char ch:s.toCharArray()){
            if(max==ch) c1++;
            if(min==ch) c2++;
        }
        if(s.charAt(0)==max &&c1==1 && c2==1 &&s.charAt(s.length()-1)==min) return 3;
        return 2;
    }
}