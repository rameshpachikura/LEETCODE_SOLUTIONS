class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
       int l=0;
        int sum=0;
        int cnt=0;
        for(int r=0;r<arr.length;r++){
            sum+=arr[r];
            if((r-l+1)==k){
                int x=sum/k;
                if(x>=threshold){
                    cnt++;
                }
                sum-=arr[l];
                l++;
            }
        }
      return cnt;
    }
}