import java.util.*;

class Solution {
    public String[] spellchecker(String[] wordlist, String[] queries) {
        Set<String> exact = new HashSet<>();
        Map<String, String> lowerMap = new HashMap<>();  // lower -> first word
        Map<String, String> vowelMap = new HashMap<>();  // devowel(lower) -> first word

        // Preprocess wordlist (preserve first occurrence via putIfAbsent)
        for (String w : wordlist) {
            exact.add(w);
            String lower = w.toLowerCase(Locale.ROOT);
            lowerMap.putIfAbsent(lower, w);
            String dev = devowel(lower);
            vowelMap.putIfAbsent(dev, w);
        }

        String[] ans = new String[queries.length];
        for (int i = 0; i < queries.length; i++) {
            String q = queries[i];

            // 1) exact match
            if (exact.contains(q)) {
                ans[i] = q;
                continue;
            }

            String lowerQ = q.toLowerCase(Locale.ROOT);

            // 2) case-insensitive match
            if (lowerMap.containsKey(lowerQ)) {
                ans[i] = lowerMap.get(lowerQ);
                continue;
            }

            // 3) vowel-error match
            String devQ = devowel(lowerQ);
            if (vowelMap.containsKey(devQ)) {
                ans[i] = vowelMap.get(devQ);
            } else {
                ans[i] = ""; // no match
            }
        }

        return ans;
    }

    // Replace vowels with a placeholder (here '*')
    private String devowel(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        for (char c : s.toCharArray()) {
            sb.append(isVowel(c) ? '*' : c);
        }
        return sb.toString();
    }

    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
