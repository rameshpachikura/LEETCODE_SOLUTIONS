class Solution {
    public int pivotIndex(int[] nums) {
       int n=nums.length;
       int sum=0;
       int temp=0;
       for(int i=0;i<nums.length;i++){
        sum+=nums[i];
       }
       for(int i=0;i<nums.length;i++){
        sum-=nums[i];
        if(sum==temp){
            return i;
        }
        temp+=nums[i];
       }
    
    return -1;
}
}