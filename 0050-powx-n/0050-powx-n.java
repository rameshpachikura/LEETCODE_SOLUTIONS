class Solution {
    public double myPow(double x, long n) {
        // Base Case
        if (n == 0)
            return 1;

        // make n pos 
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        // if n even
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        }else {
            return x * myPow(x, n - 1);
        }
    }
}