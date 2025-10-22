import java.util.*;

class Solution {
    public int maxFrequency(int[] nums, int k, int numOps) {
        int upperLimit = Arrays.stream(nums).max().getAsInt() + k;

        Map<Integer, Integer> freqCount = new HashMap<>();
        TreeMap<Integer, Integer> rangeMap = new TreeMap<>();

        for (int num : nums) {
            freqCount.put(num, freqCount.getOrDefault(num, 0) + 1);

            int left = Math.max(0, num - k);
            int right = Math.min(upperLimit, num + k);

            rangeMap.put(left, rangeMap.getOrDefault(left, 0) + 1);
            rangeMap.put(right + 1, rangeMap.getOrDefault(right + 1, 0) - 1);
            rangeMap.putIfAbsent(num, rangeMap.getOrDefault(num, 0));
        }

        int runningSum = 0, maxFreq = 1;
        for (var entry : rangeMap.entrySet()) {
            int val = entry.getKey();
            runningSum += entry.getValue();

            int currCount = freqCount.getOrDefault(val, 0);
            int convertable = runningSum - currCount;
            int possibleAdd = Math.min(convertable, numOps);
            maxFreq = Math.max(maxFreq, currCount + possibleAdd);
        }

        return maxFreq;
    }
}