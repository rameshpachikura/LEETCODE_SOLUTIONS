class Solution {
    public int compress(char[] chars) {
        int index = 0; // write pointer
        int i = 0;     // read pointer

        while (i < chars.length) {
            char currentChar = chars[i];
            int count = 0;

            // Count consecutive characters
            while (i < chars.length && chars[i] == currentChar) {
                i++;
                count++;
            }

            // Write the character
            chars[index++] = currentChar;

            // Write the count if > 1
            if (count > 1) {
                String countStr = Integer.toString(count);
                for (char c : countStr.toCharArray()) {
                    chars[index++] = c;
                }
            }
        }

        return index; // new length of compressed array
    }
}
