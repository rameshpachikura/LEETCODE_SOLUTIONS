class Solution {
    public String pushDominoes(String dominoes) {
        int n = dominoes.length();
        int[] rf = new int[n]; // right force
        int[] lf = new int[n]; // left force

        // Left to Right: Track rightward forces
        int force = 0;
        for (int i = 0; i < n; i++) {
            char ch = dominoes.charAt(i);
            if (ch == 'R') {
                force = n; 
            } else if (ch == 'L') {
                force = 0; 
            } else {
                force = Math.max(force - 1, 0); 
            }
            rf[i] = force;
        }

        // Right to Left: Track leftward forces
        force = 0;
        for (int i = n - 1; i >= 0; i--) {
            char ch = dominoes.charAt(i);
            if (ch == 'L') {
                force = n;
            } else if (ch == 'R') {
                force = 0;
            } else {
                force = Math.max(force - 1, 0);
            }
            lf[i] = force;
        }

        // Final result
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (rf[i] > lf[i]) {
                sb.append('R');
            } else if (lf[i] > rf[i]) {
                sb.append('L');
            } else {
                sb.append('.');
            }
        }

        return sb.toString();
    }
}
