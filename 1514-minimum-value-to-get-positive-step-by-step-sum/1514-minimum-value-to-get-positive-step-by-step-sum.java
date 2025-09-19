class Solution {
    public int minStartValue(int[] nums) {
        int n=nums.length;
        int prefix=0;
        int min=0;

        for(int num:nums)
        {
            prefix+=num;
            min=Math.min(min,prefix);
        }
        return 1-min;
    }
}