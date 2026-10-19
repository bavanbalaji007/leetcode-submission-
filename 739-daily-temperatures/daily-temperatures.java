class Solution {
    public int[] dailyTemperatures(int[] t) {
        int[] ans=new int[t.length];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<t.length;i++){
            while(!st.isEmpty() && t[st.peek()] < t[i]){
                int diff=i-st.peek();
                ans[st.pop()]=diff;
            }
            st.push(i);
        }
        while(!st.isEmpty()) ans[st.pop()]=0;
        return ans;
    }
}