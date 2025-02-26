class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int mx=Integer.MIN_VALUE;
        int sum=0;
        for(int num:nums){
            sum+=num;
              mx=Math.max(sum,mx);
            if(sum<0){
                sum=0;
            }
         
        }
        return mx;
    }
}