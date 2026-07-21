import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int num=sc.nextInt();
            if(num>=67) System.out.println(67);
            else System.out.println(num+1);
            
        }
    }
}