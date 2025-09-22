import java.util.HashMap;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0;
        for (int freq : frequencyMap.values()) {
            maxFrequency = Math.max(maxFrequency, freq);
        }
        int totalMaxFrequency = 0;
        for (int freq : frequencyMap.values()) {
            if (freq == maxFrequency) {
                totalMaxFrequency += freq;
            }
        }
        
        return totalMaxFrequency;
    }
}
