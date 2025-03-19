class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
       int n=nums.length;
       int ans=Integer.MAX_VALUE;
       int j=0;
       for(int i=0;i<=n-k;i++){
           j=i+k-1;
           ans=Math.min(ans,nums[j]-nums[i]);
       }
       return ans;

    }
}