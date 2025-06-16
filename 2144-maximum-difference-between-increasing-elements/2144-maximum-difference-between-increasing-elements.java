class Solution {
    public int maximumDifference(int[] nums) {
int diff = -1;  // Initialize diff to -1 as per problem constraints.
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] < nums[j]) {
                    int temp = nums[j] - nums[i];
                    if (temp > diff) {
                        diff = temp;
                    }
                }
            }
        }
        return diff;
    }
}