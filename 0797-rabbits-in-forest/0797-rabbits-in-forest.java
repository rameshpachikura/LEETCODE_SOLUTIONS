class Solution {
    public int numRabbits(int[] answers) {
      Map<Integer, Integer> map = new HashMap<>();
        int minRabbits = 0;

        // Count how many times each answer appears
        for (int ans : answers) {
            map.put(ans, map.getOrDefault(ans, 0) + 1);
        }

        // Process each unique answer
        for (int k : map.keySet()) {
            int groupSize = k + 1;
            int count = map.get(k);
            int groups = (int) Math.ceil((double) count / groupSize);
            minRabbits += groups * groupSize;
        }

        return minRabbits;

    }
}