class Solution {
    public int equalPairs(int[][] grid) {
        int N=grid.length;
        HashMap<String,Integer> map=new HashMap<>();
        for(int r=0;r<N;r++){
            StringBuilder sb=new StringBuilder();
            for(int c=0;c<N;c++){
                sb.append(grid[r][c]).append(',');
            }
            String k=sb.toString();
            map.put(k,map.getOrDefault(k,0)+1);
        }
        int ans=0;
        for(int c=0;c<N;c++){
            StringBuilder sb=new StringBuilder();
            for(int r=0;r<N;r++){
                sb.append(grid[r][c]).append(',');
            }
            String k=sb.toString();
            if(map.containsKey(k)){
                ans+=map.get(k);
            }
        }
        return ans;
    }
}