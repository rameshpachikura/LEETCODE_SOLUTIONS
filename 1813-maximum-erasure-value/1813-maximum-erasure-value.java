class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int n = nums.length;
        int sum = 0;
        HashSet<Integer> hs = new HashSet<>();
        int max = 0;
        int l = 0;
        
        for (int i = 0; i < n; i++) {
            while (hs.contains(nums[i])) {
                hs.remove(nums[l]);
                sum -= nums[l];
                l++;
            }
            sum += nums[i];
            hs.add(nums[i]);
            max = Math.max(max, sum);
        }
        
        return max;
    }
}