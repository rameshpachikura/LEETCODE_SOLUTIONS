import java.util.*;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        
        // Step 1: Store (value, index) pairs in array
        int[][] pairs = new int[n][2];  // pairs[i][0] = value, pairs[i][1] = index
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums[i];
            pairs[i][1] = i;
        }

        // Step 2: Sort by value descending to get k largest
        Arrays.sort(pairs, (a, b) -> b[0] - a[0]);

        // Step 3: Take top k elements into another array
        int[][] topK = new int[k][2];
        for (int i = 0; i < k; i++) {
            topK[i][0] = pairs[i][0];  // value
            topK[i][1] = pairs[i][1];  // original index
        }

        // Step 4: Sort the top k elements by their original index
        Arrays.sort(topK, (a, b) -> a[1] - b[1]);

        // Step 5: Extract the values into result array
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = topK[i][0];
        }

        return result;
    }
}
