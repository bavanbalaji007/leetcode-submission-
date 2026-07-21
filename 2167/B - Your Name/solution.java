import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
 
        while(tc-->0){
            int n=sc.nextInt();
            String s=sc.next();
            String t=sc.next();
 
            int[] arr=new int[26];
 
            for(char ch:s.toCharArray()){
                arr[ch-'a']++;
            }
 
            for(char ch:t.toCharArray()){
                arr[ch-'a']--;
            }
 
            boolean ok = true;
 
            for(int val:arr){
                if(val != 0){
                    ok = false;
                    break;
                }
            }
 
            if(ok) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}