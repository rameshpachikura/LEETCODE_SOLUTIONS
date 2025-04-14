class Solution {
    public int countQuadruplets(int[] nums) {
        int count=0;
        int n=nums.length;
        for(int i=0;i<n-3;i++){
            for(int j=i+1;j<n-2;j++){
                for(int k=j+1;k<n-1;k++){
                    for(int z=k+1;z<n;z++){
                        if(nums[i] + nums[j] + nums[k] == nums[z]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;  
    }
}