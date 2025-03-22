class Solution {
    public int climbStairs(int n) {
        int[] m = new int[n + 1]; 
        Arrays.fill(m, -1);
        return climb(n, m); 
    }

    private int climb(int n, int[] m) {
        if (n <= 2) {
            return n;
        }
        if (m[n] != -1) {
            return m[n];
        }
      
        m[n] = climb(n - 1, m) + climb(n - 2, m);
        return m[n];
        
    }
}