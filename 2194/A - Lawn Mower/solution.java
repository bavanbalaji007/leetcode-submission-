import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int w=sc.nextInt();
            System.out.println((n/w)*(w-1)+Math.min((n%w),w-1));
        }
    }
}