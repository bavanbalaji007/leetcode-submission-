class Solution {
    Set<List<Integer>> ans=new HashSet<>();
    public void search(int idx,int k,int n,List<Integer> curr,int csum){
        if(csum==n && curr.size()==k){
            ans.add(new ArrayList(curr));
            return ;
        }
        if(csum>n || idx>9 || curr.size()>k) return;
        csum+=idx;
        curr.add(idx);
        search(idx+1,k,n,curr,csum);
        curr.remove(curr.size()-1);
        csum-=idx;
        search(idx+1,k,n,curr,csum);
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
    search(1,k,n,new ArrayList<>(),0);
    List<List<Integer>> result=new ArrayList<>(ans);
    return result;
    }
}