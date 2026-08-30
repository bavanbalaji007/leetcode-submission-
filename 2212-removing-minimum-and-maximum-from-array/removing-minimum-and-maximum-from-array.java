class Solution {
    public int minimumDeletions(int[] nums) {
        int min=0;
        int max=0;
        for(int i=1;i<nums.length;i++){
            if(nums[min]>nums[i]) min=i;
            if(nums[max]<nums[i]) max=i;
        }
        int N=nums.length;
        int ans=Integer.MAX_VALUE;
        int maxpos=Math.max(min,max);
        int minpos=Math.min(min,max);
        ans=Math.min(maxpos+1,ans);
        ans=Math.min(N-minpos,ans);
        ans=Math.min(ans,(minpos+1)+(N-maxpos));
        return ans;
    }
}