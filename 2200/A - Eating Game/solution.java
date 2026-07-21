import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int max=0;
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
               arr[i]=sc.nextInt();
               max=Math.max(arr[i],max);
            }
            int count=0;
            for(int i=0;i<n;i++){
                if(max==arr[i]) count++;
            }
            System.out.println(count);
           
            }
        }
    }