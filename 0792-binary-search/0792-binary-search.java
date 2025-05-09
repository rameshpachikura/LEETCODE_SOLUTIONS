class Solution {
    public int search(int[] nums, int target) {
        int n=nums.length;
        int l=0;
        int h=n-1;
        while(l<=h){
            int m=l+(h-l)/2;
            if(nums[m]>target){
                h=m-1;
            }
            else if(nums[m]<target){
               l=m+1;
            } 
            else if(nums[m]==target){
                  return m;
            }
           
        }
        return -1;
    }
}