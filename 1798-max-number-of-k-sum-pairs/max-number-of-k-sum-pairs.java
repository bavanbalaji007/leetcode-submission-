class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int cnt=0;
        for(int n:nums){
            int diff=k-n;
            if(map.containsKey(diff)){
                cnt++;
                int val=map.get(diff);
                if(val==1){
                    map.remove(diff);
                }else{
                    map.put(diff,val-1);
                }
            }else{
            map.put(n,map.getOrDefault(n,0)+1);
            }
        }
        return cnt;
    }
}