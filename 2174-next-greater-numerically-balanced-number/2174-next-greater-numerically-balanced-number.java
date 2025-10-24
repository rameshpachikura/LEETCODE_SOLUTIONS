class Solution {
   public int nextBeautifulNumber(int n) {
    int num = n + 1;
    while (true) {
        if (isBeautiful(num)) return num;
        num++;
    }
}

private boolean isBeautiful(int num) {
    int[] count = new int[10];
    String s = String.valueOf(num);
    for (char c : s.toCharArray()) {
        count[c - '0']++;
    }
    for (char c : s.toCharArray()) {
        if (count[c - '0'] != (c - '0')) return false;
    }
    return true;
}

}