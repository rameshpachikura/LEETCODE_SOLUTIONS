class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int l = 0, r = 0;
        int cnt = 0;
        int min = Integer.MAX_VALUE;

        while (r < k) {
            if (blocks.charAt(r) == 'W') {
                cnt++;
            }
            r++;
        }
        min = cnt;

        while (r < n) {
            if (blocks.charAt(r) == 'W') {
                cnt++;
            }
            if (blocks.charAt(l) == 'W') {
                cnt--;
            }
            min = Math.min(min, cnt);
            l++;
            r++;
        }

        return min;
    }
}
