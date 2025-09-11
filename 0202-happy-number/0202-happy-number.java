class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            n = digitSquareSum(n);
        }
        return n == 1;
    }

    private int digitSquareSum(int n) {
        int sum = 0;
        while (n > 0) {
            int r = n % 10;
            sum += r * r;
            n /= 10;
        }
        return sum;
    }
}
