class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int change[]=new int[n+1];
        for(int q[]:queries)
        {
            int a=q[0];
            int b=q[1];
            change[a]-=1;;
            change[b+1]+=1;
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            c=c+change[i];
            if(nums[i]+c>0)
                return false;
        }
        return true;
    }
}