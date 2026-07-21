import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int[] arr=new int[7];
            for(int i=0;i<7;i++) arr[i]=sc.nextInt();
            Arrays.sort(arr);
            int sum=0;
            for(int i=0;i<6;i++) sum-=arr[i];
            System.out.println(sum+arr[6]);
        }
    }
}