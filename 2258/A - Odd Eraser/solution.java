import java.util.*;
public class Main{
	public static long gcd(long a,long b){
		while(b!=0){
			long temp=a%b;
			a=b;
			b=temp;
		}
		return a;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		
		while(tc-->0){
			
			int N=sc.nextInt();
			long first=sc.nextLong();
			long last=first;
			for(int i=1;i<N;i++){
				last=sc.nextLong();
			}
			System.out.println(gcd(first,last));
		}
	}
}