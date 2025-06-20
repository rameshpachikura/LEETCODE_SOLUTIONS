public class Solution {
    public int maxDistance(String s, int k) {
        int len = s.length();
        int u = 0, d = 0, r = 0, l = 0;
        int maxDist = 0;

        for (int i = 0; i < len; i++) {
            char move = s.charAt(i);
            
            if (move == 'N') {
                u++;
            } else if (move == 'S') {
                d++;
            } else if (move == 'E') {
                r++;
            } else if (move == 'W') {
                l++;
            }

            int vShift = Math.abs(u - d);
            int hShift = Math.abs(r - l);
            int baseDist = vShift + hShift;

            int intMoves = Math.min(u, d) + Math.min(r, l);
            int maxDistPossible = baseDist + Math.min(k, intMoves) * 2;

            maxDist = Math.max(maxDist, Math.min(i + 1, maxDistPossible));
        }

        return maxDist;
    }
}
