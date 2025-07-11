class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            int m=k==0?sum:sum%k;
            if(hm.containsKey(m)){
                if(i-hm.get(m)>1){
                    return true;
                }
            }
                else{
                    hm.put(m,i);
                }
            }

        
        return false;
    }
}
