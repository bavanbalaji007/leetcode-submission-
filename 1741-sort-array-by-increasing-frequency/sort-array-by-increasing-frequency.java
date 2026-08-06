import java.util.PriorityQueue;

class Solution {

    class Pair {
        int num;
        int freq;

        Pair(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }
    }

    public int[] frequencySort(int[] nums) {

        int[] freq1 = new int[101];
        int[] freq2 = new int[101];

        for (int n : nums) {
            if (n < 0) {
                freq2[-n]++;
            } else {
                freq1[n]++;
            }
        }

        PriorityQueue<Pair> minHeap = new PriorityQueue<>((a, b) -> {
            if (a.freq == b.freq) {
                return b.num - a.num;
            }
            return a.freq - b.freq;
        });

        for (int i = 0; i <= 100; i++) {

            if (freq1[i] != 0) {
                minHeap.offer(new Pair(i, freq1[i]));
            }

            if (i != 0 && freq2[i] != 0) {
                minHeap.offer(new Pair(-i, freq2[i]));
            }
        }

        int[] ans = new int[nums.length];
        int index = 0;

        while (!minHeap.isEmpty()) {
            Pair p = minHeap.poll();

            while (p.freq-- > 0) {
                ans[index++] = p.num;
            }
        }

        return ans;
    }
}