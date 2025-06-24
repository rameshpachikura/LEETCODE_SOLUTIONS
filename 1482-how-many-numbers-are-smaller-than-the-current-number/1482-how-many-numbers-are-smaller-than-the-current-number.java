class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n=nums.length;
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            int x=nums[i];
            int c=0;
            for(int j=0;j<n;j++){
                if(x>nums[j]){
                    c++;
                }
            }
            a[i]=c;
            c=0;
        }
        return a;
    }
}