class Solution {
   // public int sub(int cnt,int[] nums,int xor,int start,int[] dp){
    //     if(xor==0 && start!=0){
    //         return -1;
    //     }
    //     if(start>=nums.length){
    //         return cnt;
    //     }
    //     if(dp[start]!=-1) return dp[start];
    //     int take=sub(cnt+1,nums,xor^nums[start],start+1,dp);
    //     int not=sub(cnt,nums,xor,start+1);
    //     return dp[start]= Math.max(take,not);

    // }
    public int longestSubsequence(int[] nums) {
        // int[] dp=new int[nums.length];
        // Arrays.fill(dp,-1);
        // return sub(0,nums,0,0,dp);
        int xor=0;
        boolean f=false;
        for(int i=0;i<nums.length;i++){
            xor^=nums[i];
            if(nums[i]!=0) f=true;
        }
        
        if(xor!=0) return nums.length;
        if(!f) return 0;
        return nums.length-1;
    }
}