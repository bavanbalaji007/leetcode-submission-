class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>9*num) return "";
        StringBuilder ans=new StringBuilder();
        int nine=sum/9;
        int rem=sum%9;
        for(int i=0;i<nine;i++) ans.append("9");
        if(rem>0) ans.append(rem);
        while(ans.length()<num){
            ans.append("0");
        }
        return ans.toString();
    }
}