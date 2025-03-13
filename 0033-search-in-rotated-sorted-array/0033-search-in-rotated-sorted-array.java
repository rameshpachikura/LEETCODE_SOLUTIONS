class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n - 1;

        // Step 1: Find the pivot (smallest element index)
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        int pivot = low;  // Pivot index found

        // Step 2: Perform binary search on the correct half
        low = 0;
        high = n - 1;
        
        if (target >= nums[pivot] && target <= nums[high]) {
            low = pivot; 
        } else {
            high = pivot - 1;  
        }
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; 
    }
}
