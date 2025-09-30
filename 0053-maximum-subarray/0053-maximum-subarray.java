class Solution {
    public int maxSubArray(int[] nums) {
       int n=nums.length;
       if(n==1){
        return nums[0];
       }
       int cmax=0;
       int max=Integer.MIN_VALUE;
       for(int i=0;i<n;i++){
            cmax=Math.max(nums[i],cmax+nums[i]);
            max=Math.max(cmax,max);
       }
       return max;
    }
}