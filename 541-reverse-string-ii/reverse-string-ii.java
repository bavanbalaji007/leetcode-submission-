class Solution {
    public String reverse(int l, int r, String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = r; i >= l; i--) {
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }

    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();

        int i = 0;

        while (i + 2 * k <= s.length()) {
            sb.append(reverse(i, i + k - 1, s));

            int j = i + k;
            while (j < i + 2 * k) {
                sb.append(s.charAt(j));
                j++;
            }

            i += 2 * k;
        }

        int rem = s.length() - i;

        if (rem > 0) {
            if (rem < k) {
                sb.append(reverse(i, s.length() - 1, s));
            } else {
                sb.append(reverse(i, i + k - 1, s));

                int j = i + k;
                while (j < s.length()) {
                    sb.append(s.charAt(j));
                    j++;
                }
            }
        }

        return sb.toString();
    }
}