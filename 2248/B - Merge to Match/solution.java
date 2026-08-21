import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
			int N=sc.nextInt();
			int M=sc.nextInt();
			
			ArrayList<Integer> a=new ArrayList<>();
			ArrayList<Integer> b=new ArrayList<>();
			for(int i=0;i<N;i++){
				a.add(sc.nextInt());
			}
			for(int i=0;i<M;i++){
				b.add(sc.nextInt());
			}
			if(N<(M*2)){
				System.out.println("No");
				continue;
			}
			Collections.sort(a);
			Collections.sort(b);
			int n=N-1;
			int m=M-1;
			int flag=0;
			while(m>=0){
				if(a.get(n)<b.get(m)) {
					System.out.println("No");
					flag=1;
					break;
				}
				m--;
				n--;
			}
			if(flag==1) continue;
			
			m=0;
			n=0;
			while(m<M){
				if(a.get(n)>b.get(m)){
					flag=1;
					System.out.println("No");
					break;
				}
				n++;
				m++;
			}
			if(flag==0){
				System.out.println("Yes");
			}
			
		}
	}
}