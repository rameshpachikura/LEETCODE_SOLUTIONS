class Solution {
    public int arrayPairSum(int[] nums) {
        int n=nums.length;
        int l=0;
        int k=2;
        Arrays.sort(nums);
        int sum=0;
        for(int r=0;r<n;r++){
            if((r-l)==k){
                l=l+2;
            }
            if((r-l+1)==k){
                sum+=nums[l];
            }
        }
        return sum;
    }
}