class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] ans=new int[nums.length];
        for(int i=2*nums.length-1;i>=0;i--){
           int ind=i%nums.length;
           while(!st.isEmpty() && st.peek()<=nums[ind]) st.pop();
           if(i<nums.length){
            ans[i]=(st.isEmpty())?-1:st.peek();
           }
           st.push(nums[ind]);
        }
        return ans;
    }
}