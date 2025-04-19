class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        int n=nums.length;
        Arrays.sort(nums);
        return helper(nums,upper)-helper(nums,lower-1);
    }
    public int helper(int nums[],int t){
        int l=0;
        int x=nums.length;
        int h=x-1;
        int c=0;
        while(l<=h){
            int r=nums[l]+nums[h];
            if(r<=t){
                c+=(h-l);
                l++;
            }
            else{
                h--;
            }
        }
         return c;
    }
}