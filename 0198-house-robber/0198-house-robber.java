class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        int res=ans(n-1,nums,dp);
        return res;
    }
    public int ans(int n,int[] nums,int[] dp){
        if(n<0){
            return 0;
        }
        if(n==0){
            return nums[n];
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int x=Integer.MIN_VALUE;
        if(n>=1){
             x=ans(n-2,nums,dp)+nums[n];
        }
        int y=ans(n-1,nums,dp);
        dp[n]= Math.max(x,y);
        return dp[n];
        }
}