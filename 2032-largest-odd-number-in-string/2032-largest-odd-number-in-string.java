class Solution {
    public String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            char ch = num.charAt(i);
            if ((ch - '0') % 2 == 1) {
                // Found the last odd digit, return substring from start to this index
                return num.substring(0, i + 1);
            }
        }
        // No odd digit found
        return "";
    }
}