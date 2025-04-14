class Solution {
    public int[] resultsArray(int[] nums, int k) {
       if (k == 1) return nums;

        int n = nums.length;
        int[] ans = new int[n - k + 1];

        int start = 0, prev = 0, end = 1, p = 0;

        while (start <= n - k && end < n) {
            if (nums[end] == nums[prev] + 1) {
                if ((end - start + 1) == k) {
                    ans[p++] = nums[end];
                    start++;
                }
                prev = end;
                end++;
            } else {
                if (p < ans.length) {
                    ans[p++] = -1;
                }
                start++;
                end = start + 1;
                prev = start;
            }
        }

        return ans;
    }
}