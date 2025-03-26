class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
        int l = 0, ans = 0;
        HashMap<Character, Integer> hm = new HashMap<>();

        for (int r = 0; r < n; r++) {
            char ch = s.charAt(r);
            if (hm.containsKey(ch)) {
                l = Math.max(l, hm.get(ch) + 1);
            }
            hm.put(ch, r);
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
}