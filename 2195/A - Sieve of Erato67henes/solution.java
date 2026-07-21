import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            boolean one=false,six=false;
            for(int i=0;i<n;i++){
                int num=sc.nextInt();
                
                if(num==67) six=true;
            }
            if( six) System.out.println("Yes");
            else System.out.println("No");
        }
    }
}