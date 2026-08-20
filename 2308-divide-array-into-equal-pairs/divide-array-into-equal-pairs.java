class Solution {
    public boolean divideArray(int[] nums) {
        int[] freq=new int[501];
        int nn=nums.length/2;
        for(int n:nums){
            freq[n]++;
        }
        int cn=0;
        for(int i=1;i<501;i++){
            if(freq[i]%2!=0) return false;
            cn+=(freq[i]/2);
        }
        return cn==nn;

    }
}