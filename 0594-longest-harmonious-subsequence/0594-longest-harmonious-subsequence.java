class Solution {
    public int findLHS(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int max=0;
        int c=0;
        for(int key:hm.keySet()){
            int x=key+1;
            if(hm.containsKey(x)){
                c+=hm.get(key);
                c+=hm.get(x);
            }
            max=Math.max(c,max);
            c=0;
        }
        return max;
    }
}