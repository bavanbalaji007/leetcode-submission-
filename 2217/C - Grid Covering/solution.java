import java.util.*;
public class Main{
	private static long gcd(long a,long b){
		return (b==0)?a:gcd(b,a%b);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
			long N=sc.nextInt();
			long M=sc.nextInt();
			long A=sc.nextInt();
			long B=sc.nextInt();
			if(gcd(N,A)==1 && gcd(M,B)==1 && gcd(N,M)<=2){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
	}
}