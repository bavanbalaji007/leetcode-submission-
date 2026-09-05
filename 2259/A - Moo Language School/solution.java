import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
			int N=sc.nextInt();
			int K=sc.nextInt();
			sc.nextLine();
			String str=sc.nextLine();
			boolean zero=false;
			int cnt=0;
			int l=0,r=0;
			while(l<N && r<N){
				if(r-l<K){
					if(str.charAt(r)=='0') zero=true;
					r++;
				}else{
					if(!zero){
						cnt++;
						
					}
					zero=false;
					l=r;
				}
				
			}
			if(!zero) cnt++;
			System.out.println(cnt);
		}
	}
}