class Solution {
    public long countSubarrays(int[] nums, long k) {
      long cnt = 0;
        int n = nums.length;
        int l = 0;
        long sum = 0;

        for (int r = 0; r < n; r++) {
            sum += nums[r];

            while (sum * (r - l + 1) >= k) {
                sum -= nums[l];
                l++;
            }

            cnt += (r - l + 1); 
        }

        return cnt;
    }
}