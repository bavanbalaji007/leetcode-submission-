class Solution {
    public int[] sumZero(int n) {
        int[] arr=new int[n];
       int left=0,right=n-1;
       int val=n/2;
        while(left<right){
            arr[left]=val;
            arr[right]=val*-1;
            val--;
            left++;
            right--;
        }
        return arr;
    }
}