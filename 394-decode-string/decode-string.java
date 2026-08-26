class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> strst=new Stack<>();
        Stack<Integer> intst=new Stack<>();
        int num=0;
        StringBuilder curr=new StringBuilder();
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                num=num*10+(ch-'0');
            }else if(ch!='[' &&ch!=']'){
                curr.append(ch);
            }else if(ch=='['){
                intst.push(num);
                num=0;
                strst.push(curr);
                curr=new StringBuilder();
            }else{
                StringBuilder prev=strst.pop();
                int dig=intst.pop();
                String str=curr.toString();
                for(int i=0;i<dig-1;i++){
                    curr.append(str);
                }
                curr.insert(0, prev);
            }
        }
        return curr.toString();
    }
}