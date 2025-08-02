class Solution {
    public int countGoodNumbers(long n) {
        long mod = 1000000007;
        long ans = (pow(5, (n + 1) / 2, mod) * pow(4, n / 2, mod)) % mod;
        return (int) ans;
    }

    
    private long pow(long base, long exp, long mod) {
        long res = 1;
        while (exp > 0) {
            if (exp % 2 == 1) res = (res * base) % mod;
            base = (base * base) % mod;
            exp /= 2;
        }
        return res;
    }
}