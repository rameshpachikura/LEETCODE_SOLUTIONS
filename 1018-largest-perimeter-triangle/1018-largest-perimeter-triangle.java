class Solution {
    public int largestPerimeter(int[] nums) {
       int ans=0;
       int n=nums.length;
       Arrays.sort(nums);
       for(int i=0;i<n-2;i++){
                int a=nums[i];
                int b=nums[i+1];
                int c=nums[i+2];
                if(((a+b)>c)){
                    ans=Math.max(ans,a+b+c);
                }
       }
       return ans;
    }
}