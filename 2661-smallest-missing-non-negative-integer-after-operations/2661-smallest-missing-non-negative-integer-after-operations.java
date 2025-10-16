import java.util.*;

class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n = nums.length;
        Arrays.sort(nums);
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int mod = ((nums[i] % value) + value) % value;
            freq.put(mod, freq.getOrDefault(mod, 0) + 1);
        }

        int j = 0;
        while (true) {
            int mod = j % value;
            if (freq.getOrDefault(mod, 0) == 0) {
                break;
            }
            freq.put(mod, freq.get(mod) - 1);
            j++;
        }

        System.out.println(freq); // Optional
        return j;
    }

}
