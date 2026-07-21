import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tc=sc.nextInt();
        while(tc-- >0){
            int n=sc.nextInt();
            sc.nextLine();
            String str=sc.nextLine();
            int count=0,ans=0;
            ArrayList<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if(str.charAt(i)=='0') count++;
                else{
                    list.add(count);
                    count=0;
                    ans++;
                }
            }
            list.add(count);
 
            if(list.size()==1){
                System.out.println((n+2)/3);
                continue;
            }
            for(int i=0;i<list.size();i++){
                if(i==0 || i==list.size()-1) ans+=(list.get(i)+1)/3;
                else ans+=(list.get(i))/3;
            }
            System.out.println(ans);
        }
    }
}