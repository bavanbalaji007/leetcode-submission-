import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-->0){
            int n=sc.nextInt();
            int[] arr=new int[n];
            TreeSet<Integer> set=new TreeSet<>();
            for(int i=0;i<n;i++){
                 arr[i]=sc.nextInt();
                 set.add(arr[i]);
            }
            ArrayList<Integer> list=new ArrayList<>(set);
            int currmax=0,max=0;
            for(int i=0;i<list.size()-1;i++){
                if(list.get(i)+1==list.get(i+1)) currmax++;
                else{
                    max=Math.max(currmax,max);
                    currmax=0;
                }
            }
            System.out.println(Math.max(currmax,max)+1);
 
        }
    }
}