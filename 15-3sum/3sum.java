import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }

        HashSet<String> used = new HashSet<>();

        for (int lt = 0; lt < n; lt++) {
            for (int rt = lt + 1; rt < n; rt++) {
                int sum = nums[lt] + nums[rt];

                if (map.containsKey(-sum)) {
                    for (int idx : map.get(-sum)) {
                        if (idx == lt || idx == rt)
                            continue;

                        int[] temp = {nums[lt], nums[rt], -sum};
                        Arrays.sort(temp);

                        String id = temp[0] + "_" + temp[1] + "_" + temp[2];

                        if (!used.contains(id)) {
                            used.add(id);
                            ans.add(Arrays.asList(temp[0], temp[1], temp[2]));
                        }

                        while (rt + 1 < n && nums[rt] == nums[rt + 1]) {
                            rt++;
                        }
                        break;
                    }
                }
            }
        }

        return ans;
    }
}