class Solution {
    public int findPeakElement(int[] nums) {
        int temp=nums[0];
        int x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>temp){
                temp=nums[i];
                x=i;
            }
        }
        return x;
    }
}