class Solution {
    public int findMin(int[] nums) {
        int low = 0, high = nums.length - 1; 
        int ans=100000;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] <= nums[high]) {
                ans=Math.min(ans,nums[mid]);
                high = mid-1;
            } else {
                low = mid + 1;
            }
        }
        
        return ans;
    }
}