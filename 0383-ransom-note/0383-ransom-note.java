import java.util.*;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] s1 = ransomNote.toCharArray();
        char[] s2 = magazine.toCharArray();

        HashMap<Character, Integer> hs2 = new HashMap<>();

        for (char ch : s2) {
            hs2.put(ch, hs2.getOrDefault(ch, 0) + 1);
        }

        for (char ch : s1) {
            if (!hs2.containsKey(ch) || hs2.get(ch) == 0) {
                return false;
            }
            hs2.put(ch, hs2.get(ch) - 1);
        }

        return true;
    }
}
