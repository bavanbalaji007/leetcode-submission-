import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            Stack<Character> st=new Stack<>();
            int n=sc.nextInt();
            String str=sc.next();
            for(char ch:str.toCharArray()){
                if(!st.isEmpty() && st.peek()==ch){
                while(!st.isEmpty() && ch==st.peek()) st.pop();
                }else st.push(ch);
            }
            if(st.isEmpty()) System.out.println("Yes");
            else System.out.println("No");
            }
        }
    }