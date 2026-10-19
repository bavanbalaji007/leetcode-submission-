class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        List<Integer> ans=new ArrayList<>();
        int i=0;
        for(int n:nums){
            if(n==target) ans.add(i);
            i++;
        }
        return ans;
    }
}