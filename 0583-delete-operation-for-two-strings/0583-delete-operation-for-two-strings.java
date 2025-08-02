class Solution {
    public int minDistance(String word1, String word2) {
        int n1=word1.length();
        int n2=word2.length();
        int[][] dp=new int[n1][n2];
        for(int[] r:dp){
            Arrays.fill(r,-1);
        }
        int ans=helper(n1-1,n2-1,word1,word2,dp);
        int x=n1-ans;
        int y=n2-ans;
        return x+y;
    }
    public int helper(int i,int j,String word1,String word2,int[][] dp){
        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=-1){
            return dp[i][j];
        }
        int ans=0;
        if(word1.charAt(i)==word2.charAt(j)){
            dp[i][j]=1+helper(i-1,j-1,word1,word2,dp);
        }
        else{
           dp[i][j]=Math.max(helper(i,j-1,word1,word2,dp),helper(i-1,j,word1,word2,dp));
        }
        return dp[i][j];
    }
}