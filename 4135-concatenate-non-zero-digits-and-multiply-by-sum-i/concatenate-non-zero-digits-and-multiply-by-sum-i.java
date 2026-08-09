class Solution {
    public long sumAndMultiply(int n) {
        long sum=0,dig=0;
        String str=String.valueOf(n);
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='0') continue;
            dig=(dig*10)+(ch-'0');
            sum+=(ch-'0');
        }
        return dig*sum;
    }
}