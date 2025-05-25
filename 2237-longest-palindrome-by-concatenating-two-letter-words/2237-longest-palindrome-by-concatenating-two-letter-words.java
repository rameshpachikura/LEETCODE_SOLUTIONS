class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for (String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int result = 0;
        boolean center = false;

        for (String s : map.keySet()) {
            if (!map.containsKey(s)) continue;

            int count1 = map.get(s);
            String rev = new StringBuilder(s).reverse().toString();

            if (s.equals(rev)) {
                int pairs = count1 / 2;
                result += pairs * 4;
                if (count1 % 2 == 1 && !center) {
                    result += 2;
                    center = true;
                }
            } else if (map.containsKey(rev)) {
                int count2 = map.get(rev);
                int pairs = Math.min(count1, count2);
                result += pairs * 4;
                map.put(s, count1 - pairs);
                map.put(rev, count2 - pairs);
            }
        }

        return result;
    }
}