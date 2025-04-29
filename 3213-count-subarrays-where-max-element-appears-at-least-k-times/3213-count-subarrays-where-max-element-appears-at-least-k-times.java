class Solution {
    public long countSubarrays(int[] nums, int k) {
        int n=nums.length;
        int l=0;
        long ans=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int r=0;r<n;r++){
            hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
                while(hm.containsKey(max) && hm.get(max) >= k){
                      int x=hm.get(nums[l]);
                      if(x>1 || x==1){
                        hm.put(nums[l],x-1);
                      }
                      else{
                        hm.remove(nums[l]);
                      }
                      l++;
                        ans += (n - r);
                     }
            }
        return ans;
    }
}