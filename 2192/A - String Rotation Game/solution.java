import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int l=sc.nextInt();
            String str=sc.next();
            char[] arr=str.toCharArray();
            int max=0;
            for(int i=1;i<=l;i++){
                int count=1;
                for(int j=0;j<l-1;j++){
                    if(arr[j]!=arr[j+1]) count++;
                }
                max=Math.max(count,max);
                char temp=arr[l-1];
                for(int k=l-2;k>=0;k--) arr[k+1]=arr[k];
                arr[0]=temp;
            }
            System.out.println(max);
        }
    }
}