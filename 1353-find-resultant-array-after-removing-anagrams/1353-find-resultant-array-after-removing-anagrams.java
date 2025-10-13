import java.util.*;

class Solution {
    public List<String> removeAnagrams(String[] words) {
        int n = words.length;
        List<String> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a.add(words[i]);
        }

        for (int i = 1; i < a.size(); i++) {
            char[] ch1 = a.get(i - 1).toCharArray();
            char[] ch2 = a.get(i).toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);

            String s1 = new String(ch1);
            String s2 = new String(ch2);

            if (s1.equals(s2)) {
                a.remove(i);
                i--;  // adjust after removal
            }
        }

        return a;
    }
}
