import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b&&a>c){
			if(b+c<a){
				a=b+c;
			}
		}else if(b>a && b>c){
			if(a+c<b) b=a+c;
		}else if(c>a && c>b){
			if(a+b<c) c=a+b;
		}
		int max=Math.max(a,Math.max(b,c));
		int min=Math.min(a,Math.min(b,c));
		System.out.println(max-min);
	}
}}