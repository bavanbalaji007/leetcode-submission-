class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int n:asteroids){
            if(!st.isEmpty() &&(st.peek()>0 && n<0)){
                while(!st.isEmpty() &&st.peek()>0&& st.peek()<n*-1){
                    st.pop();
                }

                if(st.isEmpty()) st.push(n);
                else if(st.peek()<0) st.push(n);
                else if(st.peek()==-n) st.pop();
            }else{
                st.push(n);
            }
        }



        int[] arr=new int[st.size()];
        int i=arr.length-1;
        while(!st.isEmpty()){
            arr[i--]=st.pop();
        }
       
        return arr;
    }
}