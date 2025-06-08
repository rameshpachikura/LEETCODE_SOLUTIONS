import java.util.*;

class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> result = new ArrayList<>(n);
        int num = 1;
        
        for (int i = 0; i < n; i++) {
            result.add(num);

            // Try to go deeper (append 0)
            if (num * 10 <= n) {
                num *= 10;
            } else {
                // If we can't go deeper, increment while handling backtracking
                while (num % 10 == 9 || num + 1 > n) {
                    num /= 10;
                }
                num++;
            }
        }
        return result;
    }
}