class Solution {
    public int search(int[] nums, int target) {
       int n = nums.length;

        // Step 1: Copy and Sort the array
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        // Step 2: Find the index of the smallest element in original array
        int rotationCount = 0;
        for (int i = 0; i < n; i++) {
            if (sortedNums[0] == nums[i]) {  // Smallest element's original index
                rotationCount = i;
                break;
            }
        }

        // Step 3: Perform binary search on sorted array
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sortedNums[mid] == target) {
                // Step 4: Adjust the index based on rotation
                int adjustedIndex = (mid + rotationCount) % n;
                return adjustedIndex;
            } else if (sortedNums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; 
    }
}