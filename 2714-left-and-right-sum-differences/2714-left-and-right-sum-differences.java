class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n=nums.length;
        int[] l=new int[n];
        int[] r=new int[n];
        int[] p=new int[n];
        p[0]=nums[0];
        l[0]=0;
        for(int i=1;i<n;i++){
            p[i]=nums[i]+p[i-1];
        }
        for(int i=0;i<n;i++){
            r[i]=p[n-1]-p[i];
        }
        for(int i=1;i<n;i++){
            l[i]=p[i-1];
        }
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=Math.abs(l[i]-r[i]);
        }
        return ans;

    }
}