class Solution {
// Approach 1 : Backtracking
    int count = 0; // instance variable to track count
    public void bt(int[] nums, int idx, int currOr, int max) {
        if (currOr == max) {
            count++;
        }
        for (int i = idx; i < nums.length; i++) {
            bt(nums, i + 1, currOr | nums[i], max);
        }
    }
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for (int i : nums) {
            max |= i;
        }
        bt(nums, 0, 0, max);
        return count;
    }
}