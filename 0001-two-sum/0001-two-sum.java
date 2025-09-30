class Solution {
    public int[] twoSum(int[] nums, int target) {
      int n=nums.length;
      HashMap<Integer,Integer> hm=new HashMap<>();
      for(int i=0;i<n;i++){
        hm.put(nums[i],i);
      }  
      int[] a=new int[2];
      for(int i=0;i<n;i++){
        if(hm.containsKey(target-nums[i])){
            if(i!=hm.get(target-nums[i])){
                 a[0]=i;
            a[1]=hm.get(target-nums[i]);
            }
           
        }
      }
      return a;
    }
}