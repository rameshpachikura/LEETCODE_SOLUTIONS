import java.util.*;

class Solution {
    public int[] findXSum(int[] nums, int k, int x) {
        int n = nums.length;
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        ArrayList<Integer> res = new ArrayList<>();
        int l = 0;

        for (int r = 0; r < n; r++) {
            freqMap.put(nums[r], freqMap.getOrDefault(nums[r], 0) + 1);

            if ((r - l + 1) == k) {
                // ✅ MaxHeap: first by frequency, then by value
                PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
                    new PriorityQueue<>((a, b) -> {
                        if (b.getValue().equals(a.getValue()))
                            return b.getKey() - a.getKey(); // break tie by value
                        return b.getValue() - a.getValue();
                    });
                
                maxHeap.addAll(freqMap.entrySet());

                int sum = 0;
                for (int i = 0; i < x && !maxHeap.isEmpty(); i++) {
                    int key = maxHeap.poll().getKey();
                    sum += key * freqMap.get(key);
                }
                res.add(sum);

                // Slide window
                int freq = freqMap.get(nums[l]);
                if (freq > 1) freqMap.put(nums[l], freq - 1);
                else freqMap.remove(nums[l]);
                l++;
            }
        }

        // Convert list to array
        int[] y = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            y[i] = res.get(i);
        }

        return y;
    }
}
