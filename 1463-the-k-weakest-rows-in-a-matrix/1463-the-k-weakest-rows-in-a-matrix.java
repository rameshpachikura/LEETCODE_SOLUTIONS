import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        // Create a list of pairs [soldierCount, rowIndex]
        List<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) ones++;
            }
            list.add(new int[]{ones, i});
        }

        // Sort by soldier count, then by row index
        Collections.sort(list, (a, b) -> 
            a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]
        );

        // Take first k indices
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = list.get(i)[1];
        }
        return ans;
    }
}
