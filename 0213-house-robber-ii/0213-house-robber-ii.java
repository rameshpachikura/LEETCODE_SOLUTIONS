class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0){
            return 0;
        }
        if(n==1){
            return nums[0];
        }
        return Math.max(solve(nums,0,n-2),solve(nums,1,n-1));
    }
    int solve(int[] nums,int i,int s){
        int p1=0,p2=0;
        for(int j=i;j<=s;j++){
            int t=Math.max(p1,p2+nums[j]);
            p2=p1;
            p1=t;
        }
        return p1;
    }
}