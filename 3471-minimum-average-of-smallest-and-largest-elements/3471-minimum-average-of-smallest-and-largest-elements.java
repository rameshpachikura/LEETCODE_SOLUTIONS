class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        double ans = Double.MAX_VALUE;
        for (int i = 0; i < n/2; i++) {
            double avg = (nums[i] + nums[n - 1 - i]) / 2.0;
            ans = Math.min(ans, avg);
        }
        return ans;
    }
}