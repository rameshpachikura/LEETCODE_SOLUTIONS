class Solution {
    public long splitArray(int[] nums) {
        int n = nums.length;
        if (n < 2) return -1;

        long cnt = Long.MAX_VALUE;

        // prefix sums using long
        long[] pre = new long[n];
        pre[0] = nums[0];
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }

        // precompute strictly increasing left
        boolean[] inc = new boolean[n];
        inc[0] = true;
        for (int i = 1; i < n; i++) {
            inc[i] = inc[i - 1] && nums[i - 1] < nums[i];
        }

        // precompute strictly decreasing right
        boolean[] dec = new boolean[n];
        dec[n - 1] = true;
        for (int i = n - 2; i >= 0; i--) {
            dec[i] = dec[i + 1] && nums[i] > nums[i + 1];
        }

        // single loop to find minimum difference
        for (int r = 0; r < n - 1; r++) {
            if (inc[r] && dec[r + 1]) {
                long leftSum = pre[r];
                long rightSum = pre[n - 1] - pre[r];
                cnt = Math.min(cnt, Math.abs(leftSum - rightSum));
            }
        }

        return (cnt == Long.MAX_VALUE) ? -1 : cnt;
    }
}
