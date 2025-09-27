import java.util.*;

class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int n = mat.length;
        int m = mat[0].length;

        LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
        ArrayList<Integer> a = new ArrayList<>();

        // Count soldiers and store
        for (int i = 0; i < n; i++) {
            int ones = 0;
            for (int j = 0; j < m; j++) {
                if (mat[i][j] == 1) {
                    ones++;
                }
            }
            hm.put(i, ones);   // rowIndex -> soldierCount
            a.add(ones);       // just the counts
        }

        // Sort counts (ascending)
        Collections.sort(a);

        int[] arr = new int[k];
        HashSet<Integer> used = new HashSet<>(); // to avoid reusing same row

        // For each smallest count, find the matching key(s)
        int idx = 0;
        for (int count : a) {
            for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
                if (entry.getValue() == count && !used.contains(entry.getKey())) {
                    arr[idx++] = entry.getKey();
                    used.add(entry.getKey());
                    if (idx == k) return arr; // stop after filling k
                    break; // move to next count
                }
            }
        }
        return arr;
    }
}
