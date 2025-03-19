class Solution {
    public int minimumDifference(int[] nums, int k) {
       Arrays.sort(nums);
       int n=nums.length;
       int ans=Integer.MAX_VALUE;
       int l=0;
       for(int r=0;r<n;r++){
           if(r-l==k){
            l++;
           }
           if((r-l+1)==k){
            ans=Math.min(ans,nums[r]-nums[l]);
           }
           
       }
       return ans;

    }
}