class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long cnt=0;
        int n=nums.length;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]==0){
                c=c+1;
                ans[i]=c;
            }
            else{
                c=0;
            }
        }
        for(int i=0;i<n;i++){
            if(ans[i]!=-1){
                cnt+=ans[i];
            }
        }
        return cnt;
    }

}