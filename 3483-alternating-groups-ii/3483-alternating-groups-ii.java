class Solution {
    public int numberOfAlternatingGroups(int[] colors, int k) {
   int[] maxColors = new int[colors.length + k - 1];

        for (int i = 0; i < colors.length; i++) {
            maxColors[i] = colors[i];
        }
        for (int i = 0; i < k - 1; i++) {
            maxColors[colors.length + i] = colors[i];
        }

        int n = maxColors.length;
        int cnt = 0;
        int ind = 0;
        int max = 1;

        while (ind < n - 1) {
            if (maxColors[ind] == maxColors[ind + 1]) {
                max = 1;
                ind++;
                continue;
            }

            max++;
            ind++;

            if (max < k) continue;

            cnt++;
            max--;
        }

        return cnt;
    }
}