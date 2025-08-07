class Solution {
    public int f(int i, int j, String s1, String s2,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        int ans = 0;
        if(s1.charAt(i)!=s2.charAt(j)) 
            ans = 0 + Math.max(f(i-1,j,s1,s2,dp),f(i,j-1,s1,s2,dp));
        else ans = 1 + f(i-1,j-1,s1,s2,dp);
        return dp[i][j] = ans;
    }
    public int lcs(String text1, String text2) {
        int i = text1.length() - 1, j = text2.length() - 1;
        int dp[][] = new int[i+1][j+1];
        for(int row[]:dp) Arrays.fill(row,-1);
        return f(i,j,text1,text2,dp);
    }
    public int lps(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return lcs(s,rev);
    }
    public int minInsertions(String s) {
        int n = s.length();
        return n-lps(s);
    }
}