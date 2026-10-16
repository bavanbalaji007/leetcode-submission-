class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder ans=new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1;
        int carry=0;
        while(i>=0 && j>=0){
            int a=num1.charAt(i)-'0',b=num2.charAt(j)-'0';
            int sum=a+b+carry;
            ans.append(sum%10);
            carry=sum/10;
            i--;
            j--;
        }
        while(i>=0){
            int a=num1.charAt(i)-'0';
            int sum=a+carry;
            ans.append(sum%10);
            carry=sum/10;
            i--;
        }
         while(j>=0){
            int a=num2.charAt(j)-'0';
            int sum=a+carry;
            ans.append(sum%10);
            carry=sum/10;
            j--;
        }
        if(carry!=0)ans.append(carry);
        return ans.reverse().toString();
    }
}