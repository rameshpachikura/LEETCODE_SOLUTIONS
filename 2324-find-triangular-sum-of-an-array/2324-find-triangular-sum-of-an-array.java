class Solution {
    public int triangularSum(int[] nums) {
        int n=nums.length;
        while(n!=1){
            int[] a=new int[n-1];
            int j=0;
            for(int i=1;i<n;i++){
                a[j++]=(nums[i-1]+nums[i])%10;
            }
            for(int i=0;i<a.length;i++){
                nums[i]=a[i];
            }
            n=n-1;
        }
        return nums[0];
    }
}