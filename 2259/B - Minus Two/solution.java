import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
			int N=sc.nextInt();
			int odd=0;
			int ev1=0;
			int ev2=0;
			int[] arr=new int[N];
			for(int i=0;i<N;i++){
				arr[i]=sc.nextInt();
				int mod=arr[i]%4;
				if(mod==1||mod==3) odd++;
				else if(mod==0) ev1++;
				else if(mod==2) ev2++;
			}
			System.out.println(Math.max(odd,Math.max(ev1,ev2)));
		}
	}
}