class Solution {
    public int maxNumberOfFamilies(int n, int[][] reservedSeats) {
        Map<Integer,boolean[]> map=new HashMap<>();
        for(int[] res:reservedSeats){
            int row=res[0];
            int seat=res[1];
            if(!map.containsKey(row)){
                boolean[] s=new boolean[11];
                s[seat]=true;
                map.put(row,s);
            }else{
                boolean[] s=map.get(row);
                s[seat]=true;
                map.put(row,s);
            }
        }
        int ans=2*(n-map.size());
        for(boolean[] row:map.values()){
            boolean left=false,mid=false,right=false;
            for(int i=2;i<=5;i++){
                if(row[i]){
                    left=true;
                    break;
                }
            }
            for(int i=4;i<=7;i++){
                if(row[i]){
                    mid=true;
                    break;
                }
            }
            for(int i=6;i<=9;i++){
                if(row[i]){
                    right=true;
                    break;
                }
            }
            if(!left&& !right){
                ans+=2;
            }else if(!left|| !right|| !mid){
                ans++;
            }
        }
        return ans;
        
    }
}