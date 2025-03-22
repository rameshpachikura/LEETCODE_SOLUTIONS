class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int x=0;
        for(int k:hm.keySet()){
            if(hm.get(k)==1){
                x=k;
                break;
            }
        }
        return x;
    }
}