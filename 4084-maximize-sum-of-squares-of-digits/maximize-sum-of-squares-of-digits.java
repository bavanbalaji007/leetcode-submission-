class Solution {
    StringBuilder b=new StringBuilder();
    public void build(int num,int sum){
        if(sum<=9){
            b.append(sum);
            num--;
            for(int i=0;i<num;i++) b.append("0");
            return;
        }
        b.append('9');
        build(--num,sum-9);
    }
    public String maxSumOfSquares(int num, int sum) {
        String ans="0".repeat(num);
        if(9*num <sum) return "";
        if(sum==0) return ans;
        build(num,sum);
        return String.valueOf(b);
    }
}