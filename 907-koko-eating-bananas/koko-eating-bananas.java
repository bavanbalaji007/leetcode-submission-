class Solution {
    public int hr(int[] p,int num){
        int hrs=0;
        for(int n:p){
            hrs+=(n+num-1)/num;
        }
        return hrs;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=-1;
        for(int n:piles){
            high=Math.max(n,high);
        }
      
        while(low<high){
            int mid=(low+high)/2;
            int cal=hr(piles,mid);
            if(h>=cal) high=mid;
            else low=mid+1;
        }
        return high;
    }
}