import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		sc.nextLine();
		while(tc-->0){
			String str=sc.nextLine();
			StringBuilder sb=new StringBuilder(str);
			boolean z=false,o=false;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)=='0' && !z){
					z=true;
					continue;
				}else if(str.charAt(i)=='1' && !o){
					o=true;
					continue;
				}
				System.out.print(str.charAt(i));
			}
			System.out.println();
		}
	}
}