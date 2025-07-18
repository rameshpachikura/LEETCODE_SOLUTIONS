class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int sum=0;
        int d=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int x=nums[i];
            while(x>0){
                d+=x%10;
                x=x/10;
            }
        }
        return Math.abs(sum-d);
    }
}