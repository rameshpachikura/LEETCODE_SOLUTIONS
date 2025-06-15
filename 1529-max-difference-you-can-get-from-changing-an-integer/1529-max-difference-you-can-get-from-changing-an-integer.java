class Solution {
    public int maxDiff(int num) {
        String str = String.valueOf(num);
        int n = str.length();
        char ch = ' ';
        int x = 0;

        // Fix: find first non-9 digit
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) != '9') {
                x = i;
                ch = str.charAt(i);
                break;
            }
        }

        // If all digits are 9
        if (ch == ' ') ch = str.charAt(0);

        StringBuilder maxx = new StringBuilder();
        StringBuilder min = new StringBuilder();

        // Make maximum
        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ch) {
                maxx.append('9');
            } else {
                maxx.append(str.charAt(i));
            }
        }

        // For min, choose different digit if first digit is '1'
        char ch2 = ' ';
        for (int i = 0; i < n; i++) {
            if ((i == 0 && str.charAt(i) != '1') || (i != 0 && str.charAt(i) != '0' && str.charAt(i) != str.charAt(0))) {
                ch2 = str.charAt(i);
                x = i;
                break;
            }
        }
        if (ch2 == ' ') ch2 = str.charAt(0);

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == ch2) {
                if (x == 0) min.append('1');
                else min.append('0');
            } else {
                min.append(str.charAt(i));
            }
        }

        int m1 = Integer.parseInt(maxx.toString());
        int m2 = Integer.parseInt(min.toString());
        return m1 - m2;
    }
}
