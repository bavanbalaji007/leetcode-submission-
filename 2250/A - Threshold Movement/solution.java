import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
			int N=sc.nextInt();
			int[] w=new int[N];
			for(int i=0;i<N;i++){
				w[i]=sc.nextInt();
			}
			if(N%2==1){
				System.out.println("No");
				continue;
			}
			int minodd=Integer.MAX_VALUE;
			int maxeven=Integer.MIN_VALUE;
			for(int i=0;i<N;i++){
				if((i+1)%2==1){
					minodd=Math.min(minodd,w[i]);
				}else{
					maxeven=Math.max(maxeven,w[i]);
				}
			}
			if(minodd-maxeven>=2){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
			
		}
	
	}
}