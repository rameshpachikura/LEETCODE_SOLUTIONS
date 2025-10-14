class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        for (int i = 0; i <= nums.size() - 2 * k; i++) {
            if (check(i, nums, k) && check(i + k, nums, k)) {
                return true;
            }
        }
        return false;
    }
    public boolean check(int index, List<Integer> nums, int k) {
        for (int i = index + 1; i < index + k; i++) {
            if (nums.get(i - 1) >= nums.get(i)) {
                return false; 
            }
        }
        return true;
    }
}