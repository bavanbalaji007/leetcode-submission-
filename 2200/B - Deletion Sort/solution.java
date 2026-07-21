import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int max=0;
            int[] arr=new int[n];
            boolean found=false;
            for(int i=0;i<n;i++) arr[i]=sc.nextInt();
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                    found=true;
                    break;
                }}
                if(found) System.out.println(1);
                else System.out.println(n);
           
            }
        }
    }