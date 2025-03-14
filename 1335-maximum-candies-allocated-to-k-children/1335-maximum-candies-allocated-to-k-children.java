class Solution {
    public int maximumCandies(int[] candies, long k) {
        int n=candies.length;
        Arrays.sort(candies);
        int l=1;
        int r=candies[n-1];
        int res=0;
        while(l<=r){
            int m=l+(r-l)/2;
            long c=0;
            for(int cd:candies){
                c+=cd/m;
            }
            if(c>=k){
                res=m;
                l=m+1;
            }
            else{
                r=m-1;
            }
        }
        return res;
    }
}