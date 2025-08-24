class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0;       // window start
        int zeroCount = 0;  // how many zeros in window
        int maxLen = 0;
        
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] == 0) {
                zeroCount++;
            }
            
            // if more than 1 zero, shrink from left
            while (zeroCount > 1) {
                if (nums[left] == 0) {
                    zeroCount--;
                }
                left++;
            }
            
            // window length minus one deletion
            maxLen = Math.max(maxLen, right - left);
        }
        
        return maxLen;
    }
}
