import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		sc.nextLine();
		while(tc-->0){
			// int num1=sc.nextInt();
			// int num2=sc.nextInt();
			String str1=sc.nextLine();
			String str2=sc.nextLine();
			StringBuilder sb1=new StringBuilder();
			StringBuilder sb2=new StringBuilder();
			
			int sum=0;
			for(int ind=0;ind<str1.length();ind++){
				sum+=str1.charAt(ind)-'0';
				sb1.append(sum%10);
			}
			sum=0;
			for(int ind=0;ind<str2.length();ind++){
				sum+=str2.charAt(ind)-'0';
				sb2.append(sum%10);
			}
			int sblen1=sb1.length();
			int sblen2=sb2.length();
			if(sb1.charAt(sblen1-1)!=sb2.charAt(sblen2-1)){
				System.out.println(-1);
				continue;
			}
			int[][] LCS=new int[sblen1+1][sblen2+1];
			for(int r=1;r<sblen1+1;r++){
				for(int c=1;c<sblen2+1;c++){
					if(sb1.charAt(r-1)==sb2.charAt(c-1)){
						LCS[r][c]=LCS[r-1][c-1]+1;
					}else{
						LCS[r][c]=Math.max(LCS[r-1][c],LCS[r][c-1]);
					}
				}
			}
			System.out.println(LCS[sblen1][sblen2]);
			
			
		}
	}
}