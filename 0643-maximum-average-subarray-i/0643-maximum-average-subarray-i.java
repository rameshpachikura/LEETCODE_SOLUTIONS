class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        double temp=0;
        double res=Integer.MIN_VALUE;
        for(int r=0;r<n;r++){
            temp+=nums[r];
            if((r-l+1)==k){
                double ans=temp/k;
                res=Math.max(res,ans);
                temp-=nums[l];
                l++;
            }
        }
        return res;
    }
}