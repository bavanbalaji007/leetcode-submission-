class Solution {
    public int maxRotateFunction(int[] nums) {
    long sum=0;
    long indsum=0;
    for(int i=0;i<nums.length;i++){
        sum+=(long)nums[i];
        indsum+=(long)(i*nums[i]);
    }
    int N=nums.length;
    long max=Long.MIN_VALUE;
    for(int i=N-1;i>=0;i--){
        long ans= indsum-nums[i]*(N-1)+(sum-nums[i]);
        max=Math.max(ans,max);
        indsum=ans;
    }
    return (int)max;
       
    }
}