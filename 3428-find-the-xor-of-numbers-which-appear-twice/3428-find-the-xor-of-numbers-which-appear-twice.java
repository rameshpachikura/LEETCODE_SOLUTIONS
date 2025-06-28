class Solution {
    public int duplicateNumbersXOR(int[] nums) {
       int n=nums.length;
       HashMap<Integer,Integer> hm=new HashMap<>();
       for(int i=0;i<n;i++){
        hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
       }
       int cnt=0;
       for(int key:hm.keySet()){
          if(hm.get(key)==2){
            cnt^=key;
          }
       }
       return cnt;
    }
}