class Solution {
    public String largestOddNumber(String num) {
        // Reverse the string
        StringBuilder str = new StringBuilder(num);
        str.reverse();
        
        StringBuilder s = new StringBuilder();
        boolean oddFound = false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int digit = ch - '0';

            if (!oddFound && digit % 2 == 1) {
                oddFound = true;
                s.append(ch);
            } else if (oddFound) {
                s.append(ch);
            }
        }

        // Reverse the result to get final output
        s.reverse();
        return s.toString();
    }
}
