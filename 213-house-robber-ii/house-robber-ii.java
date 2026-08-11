class Solution {
    public int maxrob(int ind,int[] nums,int[] dp){
        if(ind<0) return 0;
        if(ind==0) return nums[ind];
        if(dp[ind]!=-1) return dp[ind];
        int pick=nums[ind]+maxrob(ind-2,nums,dp);
        int notpick=maxrob(ind-1,nums,dp);
        return dp[ind]= Math.max(pick,notpick);
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int[] num1=new int[nums.length];
        int[] num2=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(i!=0) num1[i]=nums[i];
            if(i!=nums.length-1) num2[i]=nums[i];
        }
        int[] dp1=new int[nums.length];
        int[] dp2=new int[nums.length];
        Arrays.fill(dp1,-1);
        Arrays.fill(dp2,-1);
        return Math.max(maxrob(nums.length-1,num1,dp1),maxrob(nums.length-1,num2,dp2));
    }
}