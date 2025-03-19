class Solution {
    public boolean check(int[] nums) {
        for (int num : nums) {
            if (num != 1) {
                return false;
            }
        }
        return true;
    }

    public int minOperations(int[] nums) {
        int n = nums.length;
        int k = 3, cnt = 0;

        for (int r = 0; r <= n - k; r++) {
            if (nums[r] == 0) { 
                for (int ind = r; ind < r + k; ind++) {
                    nums[ind] ^= 1; 
                }
                cnt++;
            }
        }

        if (check(nums)) {
            return cnt;
        }

        return -1; 
    }
}
