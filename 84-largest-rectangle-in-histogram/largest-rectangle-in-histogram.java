class Solution {
    public int largestRectangleArea(int[] heights) {
        int N=heights.length;
        Stack<Integer> st=new Stack<>();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<heights.length;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                int ind=st.pop();
                int area=heights[ind]*(st.isEmpty()?i:i-st.peek()-1);
                max=Math.max(max,area);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int ind=st.pop();
            int area=heights[ind]*(st.isEmpty()?N:N-1-st.peek());
            max=Math.max(area,max);
        }
    return max;
    }
}