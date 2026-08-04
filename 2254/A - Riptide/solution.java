import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int tc=sc.nextInt();
		while(tc-->0){
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int count=0;
			while(true){
				if(a==b || b==c ||a==c){
					System.out.println(count);
					break;
				}
				if(a>b && a>c){
					a--;
					if(b>c){
						c++;
					}else{
						b++;
					}
				}else if(b>a && b>c){
					b--;
					if(a>c){
						c++;
					}else{
						a++;
					}
				}else{
					c--;
					if(a>b){
						b++;
					}else{
						a++;
					}
				}
				count++;
			}
		}
	}
}