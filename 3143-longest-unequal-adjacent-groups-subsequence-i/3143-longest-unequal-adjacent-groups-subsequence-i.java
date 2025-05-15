class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {
        int n = words.length;
        List<String> longest = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<String> temp = new ArrayList<>();
            temp.add(words[i]);
            int lastGroup = groups[i];

            for (int j = i + 1; j < n; j++) {
                if (groups[j] != lastGroup) {
                    temp.add(words[j]);
                    lastGroup = groups[j];
                }
            }

            if (temp.size() > longest.size()) {
                longest = temp;
            }
        }

        return longest;
    }
}
