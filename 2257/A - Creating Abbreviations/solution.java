import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
			int N=sc.nextInt();
			int M=sc.nextInt();
			boolean[] freq=new boolean[26];
			for(int i=0;i<N;i++){
				String word=sc.next();
				freq[word.charAt(0)-'a']=true;
			}
			boolean poss=true;
			for(int i=0;i<M;i++){
				String ab=sc.next();
				for(int j=0;j<ab.length();j++){
					if(!freq[ab.charAt(j)-'A']){
						poss=false;
					}
				}
			}
			System.out.println(poss?"YES":"NO");
		}
		
	}
}