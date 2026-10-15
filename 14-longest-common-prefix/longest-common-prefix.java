class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prev=new StringBuilder(strs[0]);
        for(int i=1;i<strs.length;i++){
            String str=strs[i];
            StringBuilder curr=new StringBuilder();
            int j=0,w=0;
            while(j<prev.length() && w<str.length() && prev.charAt(j)==str.charAt(w)){
                curr.append(str.charAt(w));
                j++;
                w++;
            }
            if(curr.isEmpty()) return "";
            prev=curr;
        }
        return prev.toString();
    }
}