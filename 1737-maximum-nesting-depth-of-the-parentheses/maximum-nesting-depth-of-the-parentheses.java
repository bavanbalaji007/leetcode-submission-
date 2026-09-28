class Solution {
    public int maxDepth(String s) {
        int max=0;
        int cur=0;
        for(char ch:s.toCharArray()){
            if('('==ch) cur++;
            else if(')'==ch){
                max=Math.max(cur,max);
                cur--;
            }
        }
        return max;
    }
}