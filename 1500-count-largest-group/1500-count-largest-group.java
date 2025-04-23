class Solution {
    public int countLargestGroup(int n) {
    HashMap<Integer, Integer> hm = new HashMap<>();
        int maxSize = 0;

        for (int i = 1; i <= n; i++) {
            int sum = digitSum(i); 
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
            maxSize = Math.max(maxSize, hm.get(sum)); 
        }

        int count = 0;
        for (int val : hm.values()) {
            if (val == maxSize) {
                count++;
            }
        }

        return count;
    }

    private int digitSum(int num) {
        int sum = 0;
        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}