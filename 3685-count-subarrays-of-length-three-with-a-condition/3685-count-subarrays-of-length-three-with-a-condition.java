class Solution {
    public int countSubarrays(int[] nums) {
        int n=nums.length;
        int l=0;
        int sum=nums[l];
        int cnt=0;
        for(int r=0;r<n;r++){
            if((r-l+1)==3){
                sum+=nums[r];
                if(sum*2==(nums[r-1])){
                    cnt++;
                }
                sum=0;
                l++;
                sum=nums[l];
            }
        }
        return cnt;
    }
}