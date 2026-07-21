import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int N=sc.nextInt();
            int[] arr=new int[N+1];
            boolean found=false;
            for(int i=1;i<=N;i++) arr[i]=sc.nextInt();
            for(int st=1;st<=N;st+=2){
                ArrayList<Integer> list=new ArrayList<>();
                for(int i=st;i<=N;i=2*i) list.add(arr[i]);
                Collections.sort(list);
                int index=0;
                for(int i=st;i<=N;i=2*i){
                    if(i!=list.get(index++)){
                        System.out.println("No");
                        found=true;
                        break;
                    }
                }
                if(found) break;
            }
            if(!found) System.out.println("Yes");
        }
    }
}