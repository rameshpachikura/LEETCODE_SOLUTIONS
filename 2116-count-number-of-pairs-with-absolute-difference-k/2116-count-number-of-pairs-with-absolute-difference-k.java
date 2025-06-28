class Solution {
    public int countKDifference(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int c=0;
        for(int i=0;i<n;i++){
            int x=Math.abs(k+nums[i]);
            if(hm.containsKey(x)){
                c+=hm.get(x);
            }
        }
        return c;
    }
}