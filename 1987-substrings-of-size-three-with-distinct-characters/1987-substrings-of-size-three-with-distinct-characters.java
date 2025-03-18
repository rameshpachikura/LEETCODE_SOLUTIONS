class Solution {
    public int countGoodSubstrings(String s) {
       int n = s.length();
        if (n < 3) return 0;

        HashMap<Character, Integer> hm = new HashMap<>();
        int l = 0, cnt = 0, k = 3;

        for (int r = 0; r < n; r++) {
            hm.put(s.charAt(r), hm.getOrDefault(s.charAt(r), 0) + 1);

            if (r - l + 1 == k) {
                if (hm.size() == k) cnt++;

                char x = s.charAt(l);
                if (hm.get(x) == 1) hm.remove(x);
                else hm.put(x, hm.get(x) - 1);

                l++;
            }
        }
        return cnt;
    }
}