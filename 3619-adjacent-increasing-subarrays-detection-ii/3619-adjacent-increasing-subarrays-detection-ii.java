class Solution {
    public boolean possible(List<Integer>nums,int k){
        int n=nums.size(),countinc=0;
        int arr[]=new int[n];
        for(int i=1;i<n;i++){
            if(nums.get(i-1)<nums.get(i)) countinc++;
             arr[i]=countinc;
           if(i-2*k+1>=0) if(arr[i]-arr[i-k+1]==(k-1)&&arr[i-k]-arr[i-2*k+1]==(k-1)) return true;
        }
        
        return false;
    }
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n=nums.size();
        int low=1,high=n-1;
        int ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(possible(nums,mid)){
                ans=mid;
                low=mid+1;
            }
            else high=mid-1;
        }
        return ans;
    }
}