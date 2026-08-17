class Solution {
    int[][] dp;
    int[] prefix;
    public int max(int start,int end){
        if(start==end){
            return 0;
        }
        if(dp[start][end]!=-1){
            return dp[start][end];
        }
        int ans=-1;
        for(int i=start;i<end;i++){
            int left=sum(start,i);
            int right=sum(i+1,end);
            if(left<right){
                ans=Math.max(ans,max(start,i)+left);
            }else if(right<left){
                ans=Math.max(ans,max(i+1,end)+right);
            }else{
                ans=Math.max(ans,Math.max(max(start,i),max(i+1,end))+left);
            }

        }
        return dp[start][end]=ans;
    }
    public int sum(int start,int end){
        return prefix[end+1]-prefix[start];
    }
    public int stoneGameV(int[] stoneValue) {
        int N=stoneValue.length;
        dp=new int[N][N];
        prefix=new int[N+1];
        for(int i=0;i<N;i++){
            prefix[i+1]=prefix[i]+stoneValue[i];
        }
        for(int[] n:dp){
            Arrays.fill(n,-1);
        }
        return max(0,N-1);
    }
}