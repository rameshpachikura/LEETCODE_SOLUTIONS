import java.util.*;

class Solution {
    public int countCoveredBuildings(int n, int[][] buildings) {
        // Map row (y) -> sorted set of x's on that row
        Map<Integer, TreeSet<Integer>> rows = new HashMap<>();
        // Map column (x) -> sorted set of y's on that column
        Map<Integer, TreeSet<Integer>> cols = new HashMap<>();

        for (int[] b : buildings) {
            int x = b[0], y = b[1];
            rows.computeIfAbsent(y, k -> new TreeSet<>()).add(x);
            cols.computeIfAbsent(x, k -> new TreeSet<>()).add(y);
        }

        int cnt = 0;
        for (int[] b : buildings) {
            int a = b[0], c = b[1];

            TreeSet<Integer> xs = rows.get(c); // x positions on same row y = c
            TreeSet<Integer> ys = cols.get(a); // y positions on same column x = a

            if (xs == null || ys == null) continue;

            boolean left  = xs.lower(a) != null;  // any x < a on same row
            boolean right = xs.higher(a) != null; // any x > a on same row
            boolean down  = ys.lower(c) != null;  // any y < c on same column
            boolean up    = ys.higher(c) != null; // any y > c on same column

            if (left && right && up && down) cnt++;
        }

        return cnt;
    }
}
