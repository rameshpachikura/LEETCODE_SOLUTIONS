import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        List<int[]> result = new ArrayList<>();
        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            int next_start = intervals[i][0];
            int next_end = intervals[i][1];

            if (next_start <= end) {
                end = Math.max(end, next_end);
            } else {
                result.add(new int[]{start, end});
                start = next_start;
                end = next_end;
            }
        }
        result.add(new int[]{start, end});

        return result.toArray(new int[result.size()][]);
    }
}