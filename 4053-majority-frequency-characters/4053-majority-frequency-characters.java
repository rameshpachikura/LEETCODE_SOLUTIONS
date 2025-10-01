import java.util.*;

class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int n = s.length();

        // Count frequencies
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);
        }

        // Group characters by frequency
        HashMap<Integer, List<Character>> grouped = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : hm.entrySet()) {
            int count = entry.getValue();
            char ch = entry.getKey();
            grouped.putIfAbsent(count, new ArrayList<>());
            grouped.get(count).add(ch);
        }

        // Find max group size
        int maxGroupSize = 0;
        for (List<Character> list : grouped.values()) {
            maxGroupSize = Math.max(maxGroupSize, list.size());
        }

        // Among groups with max size, pick the one with highest frequency
        int majorityFrequency = -1;
        List<Character> majorityGroup = new ArrayList<>();
        for (Map.Entry<Integer, List<Character>> entry : grouped.entrySet()) {
            int freq = entry.getKey();
            List<Character> list = entry.getValue();
            if (list.size() == maxGroupSize && freq > majorityFrequency) {
                majorityFrequency = freq;
                majorityGroup = list;
            }
        }

        // Build result string
        StringBuilder sb = new StringBuilder();
        for (char ch : majorityGroup) {
            sb.append(ch);
        }

        System.out.println("Majority Frequency: " + majorityFrequency);
        return sb.toString();
    }
}
