class RecentCounter {
    ArrayList<Integer> list=new ArrayList<>();
    public RecentCounter() {
        
    }
    
    public int ping(int t) {
        list.add(t);
        int left=t-3000;
        int cnt=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=left && list.get(i)<=t) cnt++;
        }
        return cnt;
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */