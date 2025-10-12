class Solution {
    static final long MOD = 1_000_000_007L;
    public int magicalSum(int m, int k, int[] nums) {
         int n = nums.length;
        // Precompute factorials and inverse factorials up to m
        long[] fact = new long[m + 1];
        long[] invFact = new long[m + 1];
        fact[0] = 1;
        for (int i = 1; i <= m; i++) fact[i] = (fact[i - 1] * i) % MOD;
        invFact[m] = modPow(fact[m], MOD - 2);
        for (int i = m; i > 0; i--) invFact[i - 1] = (invFact[i] * i) % MOD;

        // Precompute weights W_b[c] = nums[b]^c / c!  (mod MOD)
        long[][] W = new long[n][m + 1];
        for (int b = 0; b < n; b++) {
            W[b][0] = 1;
            long pow = 1;
            for (int c = 1; c <= m; c++) {
                pow = (pow * (nums[b] % MOD)) % MOD;
                W[b][c] = (pow * invFact[c]) % MOD;
            }
        }

        // dp[s][t][u] for current bit b
        long[][][] dp = new long[m + 1][m + 1][k + 1];
        dp[0][0][0] = 1;

        for (int b = 0; b < n; b++) {
            long[][][] next = new long[m + 1][m + 1][k + 1];
            for (int s = 0; s <= m; s++) {
                for (int t = 0; t <= s; t++) { // carry at bit b cannot exceed s
                    for (int u = 0; u <= k; u++) {
                        long cur = dp[s][t][u];
                        if (cur == 0) continue;
                        int maxC = m - s;
                        for (int c = 0; c <= maxC; c++) {
                            int bit = (t + c) & 1;
                            int nu = u + bit;
                            if (nu > k) continue;
                            int ns = s + c;
                            int nt = (t + c) >>> 1;
                            long add = (cur * W[b][c]) % MOD;
                            next[ns][nt][nu] = (next[ns][nt][nu] + add) % MOD;
                        }
                    }
                }
            }
            dp = next;
        }

        // Sum over states with s == m and u + popcount(t) == k
        long totalWeight = 0;
        for (int t = 0; t <= m; t++) {
            int pc = Integer.bitCount(t);
            for (int u = 0; u <= k; u++) {
                if (u + pc == k) {
                    totalWeight = (totalWeight + dp[m][t][u]) % MOD;
                }
            }
        }

        long ans = (totalWeight * fact[m]) % MOD; // multiply by m! for orderings
        return (int) ans;
    }

    private long modPow(long a, long e) {
        long res = 1 % MOD;
        a %= MOD;
        while (e > 0) {
            if ((e & 1) == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            e >>= 1;
        }
        return res;
    }
}