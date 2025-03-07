class Solution {
    public int[] closestPrimes(int left, int right) {
   ArrayList<Integer> primes = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            if (isPrime(i)) {
                primes.add(i);
            }
        }

        if (primes.size() < 2) return new int[]{-1, -1};

        int minDiff = Integer.MAX_VALUE, p1 = -1, p2 = -1;

        for (int i = 1; i < primes.size(); i++) {
            int diff = primes.get(i) - primes.get(i - 1);
            if (diff < minDiff) {
                minDiff = diff;
                p1 = primes.get(i - 1);
                p2 = primes.get(i);
            }
        }

        return new int[]{p1, p2};
    }

    private boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}