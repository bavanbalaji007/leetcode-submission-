import java.util.*;
public class Main{
    public static int sum(long num){
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            long x=sc.nextLong();
            long y=x+90;
            int count=0;
            for(long i=x;i<=y;i++){
                if(x==(i-sum(i))) count++;
            }
            System.out.println(count);
        }
    }
}