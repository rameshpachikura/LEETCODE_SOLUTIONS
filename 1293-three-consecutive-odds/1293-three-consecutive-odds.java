class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n=arr.length;
        int cnt=0;
        for(int r=0;r<n;r++){
            if(arr[r]%2==1){
                cnt++;
                if(cnt==3){
                    return true;
                }
            }
            else{
                cnt=0;
            }
        }
        return false;
    }
}