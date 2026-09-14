class Solution {
    public boolean increasingTriplet(int[] nums) {
        int fir=nums[0];
        int sec=Integer.MAX_VALUE;
        for(int i=1;i<nums.length;i++){
            if(fir>=nums[i]){
                fir=nums[i];
            }else if(sec>=nums[i]){
                sec=nums[i];
            }else  return true;
        }
        return false;
    }
}