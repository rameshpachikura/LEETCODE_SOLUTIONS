class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
       int n=nums.length;
       int cnt=0;
       for(int i=0;i<n-2;i++){
          for(int j=i+1;j<n-1;j++){
            for(int k=j+1;k<n;k++){
                if((nums[j] - nums[i] == diff) &&(nums[k] - nums[j] == diff)){
                    cnt++;
                }
            }
          }
       }   
       return cnt;
    }
}