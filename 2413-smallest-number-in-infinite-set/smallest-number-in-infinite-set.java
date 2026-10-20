class SmallestInfiniteSet {
    int curr=1;
    TreeSet<Integer> set=new TreeSet<>();
    public SmallestInfiniteSet() {
        
    }
    
    public int popSmallest() {
        if(!set.isEmpty()) return set.pollFirst();
        return curr++;
    }
    
    public void addBack(int num) {
        if(num<curr){
            set.add(num);
        }
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */