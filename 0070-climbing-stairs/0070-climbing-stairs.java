class Solution {
    public int climb(int x,int[] dp){
         if(x<0){
            return 0;
        }
        if(x==0){
            return 1;
        }
        if(dp[x]!=-1){
            return dp[x];
        }
        dp[x]=climb(x-2,dp)+climb(x-1,dp);
        return dp[x];
    }
    public int climbStairs(int n) {
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n,dp);
    }
}