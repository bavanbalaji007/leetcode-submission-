import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int m=sc.nextInt();
            int h=sc.nextInt();
            int[] arr=new int[n];
            int[] arr2=new int[n];
            for(int i=0;i<n;i++) {
                arr[i]=sc.nextInt();
                arr2[i]=arr[i];
            }
           HashSet<Integer> list=new HashSet<>();
            while(m-->0){
                int b=sc.nextInt()-1;
                int c=sc.nextInt();
                arr2[b]+=c;
                list.add(b);
                if(arr2[b]>h){
                    for(int k: list){
                        arr2[k]=arr[k];
                    }
                    list.clear();
                }
                
            }
            for(int i=0;i<n;i++) System.out.print(arr2[i]+" ");
            System.out.println();
        }
    }
}