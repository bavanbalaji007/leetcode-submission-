import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int N=sc.nextInt();
            int K=sc.nextInt();
            int[] arr=new int[N+2];
            int[] dp=new int[N+2];
            for(int idx=1;idx<=N;idx++){
                arr[idx]=sc.nextInt();
            }
            int spi=sc.nextInt();
            arr[0]=arr[N+1]=arr[spi];
            for(int idx=1;idx<spi;idx++){
                dp[idx]=dp[idx-1]+((arr[idx-1]==arr[idx])?0:1);
            }
            for(int idx=N;idx>spi;idx--){
                dp[idx]=dp[idx+1]+((arr[idx+1]==arr[idx])?0:1);
            }
            dp[spi]=Math.max(dp[spi-1],dp[spi+1]);
          if((dp[spi-1]>=dp[spi+1] && arr[spi]!=arr[spi-1]) ||(arr[spi]!=arr[spi+1]&& dp[spi-1]<=dp[spi+1]) ){
          	dp[spi]++;
          }
            System.out.println(dp[spi]);
        }
 
    }
}