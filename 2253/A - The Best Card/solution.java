import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        int MAX = 200001;
        boolean[] prime = new boolean[MAX + 1];
        Arrays.fill(prime, true);
        prime[0] = prime[1] = false;
 
        for (int i = 2; i * i <= MAX; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= MAX; j += i) {
                    prime[j] = false;
                }
            }
        }
 
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
 
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
 
            if (prime[n + 1]) {
                sb.append("YES
");
            } else {
                sb.append("NO
");
            }
        }
 
        System.out.print(sb.toString());
    }
}