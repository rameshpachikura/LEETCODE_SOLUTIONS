class Solution {
    public int maximumLength(int[] nums) {
        int[] evenorodd = new int[2]; 
        int[] alter = new int[2];   

        for (int num : nums) {
            int parity = num % 2;
            evenorodd[parity]++;
            alter[parity] = alter[1 - parity] + 1;
        }

        return Math.max(Math.max(evenorodd[0], evenorodd[1]),Math.max(alter[0], alter[1]));        
    }
}