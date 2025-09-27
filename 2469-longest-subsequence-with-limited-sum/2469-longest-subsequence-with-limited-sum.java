class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
     int n=nums.length;
     int m=queries.length;
     int[] a=new int[m];
     Arrays.sort(nums);
     int l=0;
     for(int i=0;i<m;i++){
        int res=queries[i];
        int sum=0;
        int max=0;
        for(int j=0;j<n;j++){
            sum+=nums[j];
            if(sum<=res){
                max=Math.max(max,j+1);
            }
            else{
                break;
            }
        }
        a[i]=max;
     }
     return a;
     
    }
}