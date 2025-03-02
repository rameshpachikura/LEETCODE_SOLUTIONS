import java.util.*;

class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer, Integer> hm = new HashMap<>();


        for (int i = 0; i < nums1.length; i++) {
            hm.put(nums1[i][0], nums1[i][1]);
        }

        for (int i = 0; i < nums2.length; i++) {
            int key = nums2[i][0];
            int value = nums2[i][1];
            hm.put(key, hm.getOrDefault(key, 0) + value);
        }
        int[][] result = new int[hm.size()][2];
        int index = 0;

        List<Integer> sortedKeys = new ArrayList<>(hm.keySet());
        Collections.sort(sortedKeys);

        for (int key : sortedKeys) {
            result[index][0] = key;
            result[index][1] = hm.get(key);
            index++;
        }

        return result;
    }
}
