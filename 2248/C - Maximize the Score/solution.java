import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
			int N=sc.nextInt();
			long[] arr=new long[N*2];
			long[] points=new long[N+N];
			HashMap<Integer,ArrayList<Integer>> map=new HashMap<>();
			for(int i=1;i<=N;i++){
				map.put(i,new ArrayList<>());
			}
			for(int i=0;i<N*2;i++){
				arr[i]=sc.nextLong();
				map.get((int)arr[i]).add(i);
				if(map.get((int)arr[i]).size()==2){
					ArrayList<Integer> curr=map.get((int)arr[i]);
					long t=(curr.get(1)-curr.get(0)+1);
					points[i]=t*t;
				}
			}
			long[] maxpt=new long[N+N];
			maxpt[0]=1;
			for(int i=1;i<N+N;i++){
				
					maxpt[i]=maxpt[i-1]+1;
					if(points[i]!=0){
					List<Integer> a=map.get((int)arr[i]);
					int l=a.get(0);
					long prv=0;
					if(l>0) prv=maxpt[l-1];
					long tt=prv+ points[i];
					maxpt[i]=Math.max(maxpt[i],tt);
					}
				
			}
			System.out.println(maxpt[N+N-1]);
			
		}
	}
}