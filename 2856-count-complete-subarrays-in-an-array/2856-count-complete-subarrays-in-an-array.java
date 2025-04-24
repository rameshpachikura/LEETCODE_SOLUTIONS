class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n=nums.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }
        int l=0;
        int cnt=0;
       HashMap<Integer,Integer> hm=new HashMap<>();
        for(int r=0;r<n;r++){
           hm.put(nums[r],hm.getOrDefault(nums[r],0)+1);
           while(hm.size()==hs.size()){
             cnt += nums.length - r;
               hm.put(nums[l],hm.get(nums[l]) - 1);
                if (hm.get(nums[l]) <= 0)hm.remove(nums[l]);
                l+= 1;
           }
        }
        return cnt;
    }
}