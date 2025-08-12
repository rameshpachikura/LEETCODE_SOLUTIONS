import java.util.Arrays;

class Solution {
    static final int MOD = 1000000007;

    public int numberOfWays(int n, int x) {
        int[][] dp = new int[n+1][n+1];
        for (int j = 0; j <= n; j++) {
            Arrays.fill(dp[j], -1);
        }
        return helper(n, x, 1, dp);
    }

    public int helper(int n, int x, int i, int[][] dp) {
        if (n < 0) return 0;
        if (n == 0) return 1;
        if (i > n) return 0;
        if (dp[n][i] != -1) return dp[n][i];

        int power = (int) Math.pow(i, x);
        long include = 0;
        long exclude = 0;

        if (n - power >= 0) {
            include = helper(n - power, x, i + 1, dp);
        }
        exclude = helper(n, x, i + 1, dp);

        long result = (include + exclude) % MOD;
        if (result < 0) result += MOD; 
        dp[n][i] = (int) result;

        return dp[n][i];
    }
}
