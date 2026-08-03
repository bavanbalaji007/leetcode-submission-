class Solution {
    List<List<Integer>> res=new ArrayList<>();
    public void generate(int[] nums,boolean[] vis,List<Integer> curr){
        if(curr.size()==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
           if(vis[i]) continue;
           if(i>0 && nums[i-1]==nums[i] && !vis[i-1]) continue;
            vis[i]=true;
            curr.add(nums[i]);
            generate(nums,vis,curr);
            curr.remove(curr.size()-1);
            vis[i]=false;

        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
         generate(nums,new boolean[nums.length],new ArrayList<>());
        return res;
    }
}