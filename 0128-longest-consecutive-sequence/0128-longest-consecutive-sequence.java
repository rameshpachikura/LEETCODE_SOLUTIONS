class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num); // O(n)

        int longest = 0;

        for (int num : set) { // loop directly over set
            if (!set.contains(num - 1)) { // only start of sequence
                int current = num;
                int streak = 1;

                while (set.contains(current + 1)) {
                    current++;
                    streak++;
                }

                longest = Math.max(longest, streak);
            }
        }

        return longest;
    }
}
