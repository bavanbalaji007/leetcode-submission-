class Solution {
    public int compress(char[] chars) {
        int left=0;
        int right=0;
        while(right<chars.length){
            char comp=chars[right];
            int start=right;
            while(right<chars.length && comp==chars[right]) right++;

            int sub=right-start;
            chars[left++]=comp;
            if(sub>1){
                String dig=String.valueOf(sub);
                for(int i=0;i<dig.length();i++)chars[left++]=dig.charAt(i);
            }
        }
        return left;
    }
}