import java.util.*;

class Solution {

    long gcd(long a, long b) {
        while (b != 0) {
            long temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    long count(long x, int[] coins) {
        int n = coins.length;
        long ans = 0;

        // Generate every subset
        for (int mask = 1; mask < (1 << n); mask++) {

            long LCM = 1;
            int bits = 0;
            boolean valid = true;

            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    bits++;

                    LCM = lcm(LCM, coins[i]);

                    // LCM is already bigger than x
                    if (LCM > x) {
                        valid = false;
                        break;
                    }
                }
            }

            if (!valid) continue;

            long multiples = x / LCM;

            // Odd number of elements -> add
            // Even number of elements -> subtract
            if (bits % 2 == 1) {
                ans += multiples;
            } else {
                ans -= multiples;
            }
        }

        return ans;
    }

    public long findKthSmallest(int[] coins, int k) {

        long low = 1;
        long high = (long) Arrays.stream(coins).min().getAsInt() * k;

        while (low < high) {

            long mid = low + (high - low) / 2;

            if (count(mid, coins) >= k) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }
}