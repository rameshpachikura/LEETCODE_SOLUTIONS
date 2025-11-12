class Solution {
    public int minOperations(int[] nums) {
        int countone = 0;
        int n = nums.length;
        for(int i : nums){
            if(i == 1) countone++;
        }

        if(countone > 0) return n - countone;

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < n; i++){
            int val = nums[i];
            for(int j = i+1; j < n; j++){
                val = gcd(val, nums[j]);
                if(val == 1){
                    min = Math.min(min, j-i);
                    break;
                }
            }
        }

        if(min == Integer.MAX_VALUE) return -1;
        return (n - 1) + min;

    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}