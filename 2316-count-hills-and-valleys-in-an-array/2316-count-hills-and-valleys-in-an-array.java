class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int h = 0;
        int v = 0;
        int i = 1;

        while (i < n - 1) {
            // Skip if nums[i] is same as nums[i-1]
            if (nums[i] == nums[i - 1]) {
                i++;
                continue;
            }

            // Move j to the next different element after i
            int j = i + 1;
            while (j < n && nums[j] == nums[i]) {
                j++;
            }

            // Ensure j is within bounds
            if (j < n) {
                if (nums[i] > nums[i - 1] && nums[i] > nums[j]) {
                    h++;
                } else if (nums[i] < nums[i - 1] && nums[i] < nums[j]) {
                    v++;
                }
            }

            i++;
        }

        return h + v;
    }
}
