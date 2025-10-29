class Solution {
    public int smallestNumber(int n) {
        int l = Integer.toBinaryString(n).length();
        String x = "";

        for (int i = 0; i < l; i++) {
            x += "1";
        }
        int y = Integer.parseInt(x, 2);

        return y;

    }
}