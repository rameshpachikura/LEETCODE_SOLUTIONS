class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int sum=0;
        for(int r=0;r<n;r+=2){
                sum+=nums[r];
        }
        return sum;
    }
}