class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        for(int n:candies){
            max=Math.max(n,max);
        }
        List<Boolean> ans=new ArrayList<>();
        for(int n:candies){
            int num=n+extraCandies;
            if(max<=num) ans.add(true);
            else ans.add(false);
        }
        return ans;
    }
}