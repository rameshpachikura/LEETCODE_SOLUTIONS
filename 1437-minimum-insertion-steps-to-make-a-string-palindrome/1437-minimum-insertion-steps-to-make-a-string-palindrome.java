class Solution {
    public int minInsertions(String s) {
      int n=s.length();
      StringBuilder sb=new StringBuilder(s);
      int[][] dp=new int[n][n];
      for(int[] r:dp){
        Arrays.fill(r,-1);
      }
      int ans=helper(n-1,n-1,s,sb.reverse().toString(),dp);
      System.out.println(ans);
      return n-ans;  
    }
    public int helper(int i,int j,String s1,String s2,int[][] dp){
        if(i<0 || j<0){
            return 0;
        }
        int ans=0;
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        if(s1.charAt(i)==s2.charAt(j)){
            dp[i][j]=1+helper(i-1,j-1,s1,s2,dp);
        }
        else{
            dp[i][j]=Math.max(helper(i,j-1,s1,s2,dp),helper(i-1,j,s1,s2,dp));
        }
        return dp[i][j];
    }
}