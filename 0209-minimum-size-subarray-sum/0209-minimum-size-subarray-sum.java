class Solution {
    public int minSubArrayLen(int target, int[] nums) {
       int min=Integer.MAX_VALUE;
       int l=0;
       int sum=0;
       int s1=0;
       for(int i=0;i<nums.length;i++){
        s1+=nums[i];
       }
       if(s1<target){
        return 0;
       }
       for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            while(sum>=target){
                min=Math.min(min,r-l+1);
                sum-=nums[l];
                 l++;
            }
       } 
       return min;
    }
}