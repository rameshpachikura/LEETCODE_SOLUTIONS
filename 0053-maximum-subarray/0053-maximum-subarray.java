class Solution {
    public int maxSubArray(int[] nums) {
      int n=nums.length;
      int max=Integer.MIN_VALUE;
      int cmax=0;
      for(int i=0;i<n;i++){
          cmax=Math.max(nums[i],cmax+nums[i]);
          max=Math.max(max,cmax);
      }
      return max;
    }
}