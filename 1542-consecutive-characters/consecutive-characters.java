class Solution {
    public int maxPower(String s) {
        int ans=1;
        int i=0,j=1;
        while(j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                int dis=j-i;
                ans=Math.max(dis,ans);
                i=j;
            }
            j++;
        }

        return Math.max(ans,j-i);
    }
}