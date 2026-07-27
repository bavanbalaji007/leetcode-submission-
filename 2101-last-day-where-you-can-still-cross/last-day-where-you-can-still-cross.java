class Solution {
    private void join(int[] leader,int left,int right){
        leader[find(leader,right)]=find(leader,left);
    }
    private int find(int[] leader,int node){
        if(leader[node]!=node){
            leader[node]=find(leader,leader[node]);
        }
        return leader[node];
    }
    public int latestDayToCross(int R, int C, int[][] cells) {
        int[] leader=new int[R*C+2];
        boolean[] water=new boolean[R*C+2];
        for(int i=0;i<R*C+2;i++){
            leader[i]=i;
        }
        int days=0;
        int[][] diff= {{-1,0},{0,-1},{-1,-1},{1,0},{0,1},{1,1},{1,-1},{-1,1}};
        for(int[] cel:cells){
            int row=cel[0],col=cel[1];
            row--; col--;
            water[row*C+col+1]=true;
            for(int[] d:diff){
                int ar=d[0]+row,ac=d[1]+col;
                if(ar>=0 && ar<R && ac>=0 && ac<C && water[ar*C+ac+1]){
                    join(leader,row*C+col+1,ar*C+ac+1);
                }
            }
            if(col==0){
                join(leader,0,row*C+col+1);
            }else if(col==C-1){
                join(leader,row*C+col+1,R*C+1);
            }
            if(find(leader,0)==find(leader,R*C+1)){
                break;
            }
            days++;
        }
        return days;
        
    }
}