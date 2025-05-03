class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int n = tops.length;
        int x = tops[0];
        int y = bottoms[0];

        int res1 = check(x, tops, bottoms); // Try making all x
        if (res1 != -1) return res1;

        int res2 = check(y, tops, bottoms); // If x fails, try y
        return res2;
    }

    private int check(int target, int[] tops, int[] bottoms) {
        int rotateTop = 0;
        int rotateBottom = 0;

        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) {
                return -1; // Not possible
            } else if (tops[i] != target) {
                rotateTop++;
            } else if (bottoms[i] != target) {
                rotateBottom++;
            }
        }

        return Math.min(rotateTop, rotateBottom);
    }
}
