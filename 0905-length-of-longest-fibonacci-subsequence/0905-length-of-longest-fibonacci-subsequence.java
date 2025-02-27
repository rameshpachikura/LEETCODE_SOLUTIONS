import java.util.HashSet;

class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num); // Store all elements for quick lookup
        }

        int maxLen = 0;

        // Iterate through all pairs (arr[i], arr[j]) as the first two numbers
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int a = arr[i], b = arr[j];
                int length = 2; // Every valid sequence starts with two elements

                // Try to extend the sequence greedily
                while (set.contains(a + b)) {
                    int next = a + b;
                    a = b;
                    b = next;
                    length++;
                }

                // Update the maximum length found
                maxLen = Math.max(maxLen, length);
            }
        }

        return maxLen > 2 ? maxLen : 0; // If no valid sequence is found, return 0
    }
}
