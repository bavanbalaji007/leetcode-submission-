class Solution {
    public boolean vow(char ch){
        return ch=='a'||ch=='i'||ch=='o'||ch=='u'||ch=='e';
    }
    public int maxVowels(String s, int k) {
        int max=-1;
        int left=0;
        int cnt=0;
        for(int right=0;right<s.length();right++){
            int sub=right-left+1;
            if(vow(s.charAt(right))) cnt++;
            if(sub>=k){
                max=Math.max(cnt,max);
                if(vow(s.charAt(left))) cnt--;
                left++;
            }
                
            
        }
        return max;
    }
}