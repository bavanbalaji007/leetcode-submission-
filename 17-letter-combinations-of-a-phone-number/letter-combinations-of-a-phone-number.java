class Solution {
    String[] key={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> ans=new ArrayList<>();
    public void search(int kidx,int didx,String digits,StringBuilder sb){
        if(digits.length()==sb.length()){
            ans.add(sb.toString());
            return;
        }
        int calidx=(digits.charAt(kidx)-'0')-2;
        if(key[calidx].length()<=didx) return;
        sb.append(key[calidx].charAt(didx));
        search(kidx+1,0,digits,sb);
        sb.deleteCharAt(sb.length() - 1);
        search(kidx,didx+1,digits,sb);


    }
    public List<String> letterCombinations(String digits) {
    search(0,0,digits,new StringBuilder());
     return ans;   
    }
}