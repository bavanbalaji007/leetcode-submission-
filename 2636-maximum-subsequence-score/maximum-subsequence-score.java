class pair{
    int key;
    int val;
    public pair(int k,int v){
        key=k;
        val=v;
    }
}
class Solution {
    public long maxScore(int[] nums1, int[] nums2, int k) {
        ArrayList<pair> list=new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            list.add(new pair(nums1[i],nums2[i]));
        }
        list.sort((a, b) -> Integer.compare(b.val, a.val));
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        long curr=0;
        long max=0;
        for(pair p:list){
            curr+=p.key;
            pq.add(p.key);
            if(pq.size()>k){
                curr-=pq.poll();
            }
            if(pq.size()==k){
                max=Math.max(curr*p.val,max);
            }
        }
        return max;

    }
}