class Solution {
    public int maxDifference(String s) {
         HashMap<Character, Integer> freqMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        int maxDiff = Integer.MIN_VALUE;
        int maxOdd = Integer.MIN_VALUE;
        int minEven = Integer.MAX_VALUE;

        for (int freq : freqMap.values()) {
            if (freq % 2 == 0) {
                minEven = Math.min(minEven, freq);
            } else {
                maxOdd = Math.max(maxOdd, freq);
            }
        }

        if (maxOdd != Integer.MIN_VALUE && minEven != Integer.MAX_VALUE) {
            maxDiff = maxOdd - minEven;
        }

        return maxDiff == Integer.MIN_VALUE ? -1 : maxDiff;
    }
}