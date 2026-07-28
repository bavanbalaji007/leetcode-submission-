class Solution {
    public int find(int[] leader, int node){
        if(leader[node]!=node){
            leader[node]=find(leader,leader[node]);
        }
        return leader[node];
    }
    public void joint(int[] leader,int left,int right){
        leader[find(leader,right)]=find(leader,left);
    }
    public int findCircleNum(int[][] isC) {
        int N=isC.length;
        int[] leader=new int[N+1];
        for(int i=0;i<N+1;i++){
            leader[i]=i;
        }
        for(int r=0;r<N;r++){
            for(int c=0;c<N;c++){
                if(isC[r][c]==1 && r!=c){
                    joint(leader,r+1,c+1);
                }
            }
        }
        int count=0;
        for(int i=1;i<N+1;i++){
            if(i==find(leader,i)) count++;
        }
        return count;
    }
}