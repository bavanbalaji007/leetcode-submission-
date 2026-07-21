import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int d=sc.nextInt();
            if(m>d){
                System.out.println(n);
                continue;
            }
                
            int max=(d/m)+1;
            System.out.println((n+max-1)/max);
            
        }
    }
}