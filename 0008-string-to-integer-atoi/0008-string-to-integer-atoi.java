class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int result = 0;
        int sign = 1;

        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check if the string is now empty
        if (i >= n) return 0;

        // 3. Handle optional '+' or '-' sign
        if (s.charAt(i) == '+' || s.charAt(i) == '-') {
            sign = s.charAt(i) == '-' ? -1 : 1;
            i++;
        }

        // 4. Read digits and convert
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // 5. Handle overflow before it happens
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
