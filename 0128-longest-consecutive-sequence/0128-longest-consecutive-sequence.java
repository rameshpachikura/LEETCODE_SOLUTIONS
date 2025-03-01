class Solution {
    public int longestConsecutive(int[] nums) {
     int n=nums.length;
     int len=1;
     int maxlen=1;
     Arrays.sort(nums);
     if(n==0){
        return 0;
     }
     for(int i=1;i<n;i++){
        if (nums[i] == nums[i - 1]) continue;
        if(nums[i]-nums[i-1]==1){
            len++;
        }
        else{
            maxlen=Math.max(len,maxlen);
            len=1;
        }
     }  
     return Math.max(maxlen, len); 
    }
}