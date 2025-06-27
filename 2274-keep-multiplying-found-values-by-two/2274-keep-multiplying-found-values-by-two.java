class Solution {
    public int findFinalValue(int[] nums, int original) {
        int n=nums.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(nums[i],i);
        }
        boolean x=true;
        while(x){
            if(hm.containsKey(original)){
                original=original*2;
                x=true;
            }
            else{
                x=false;
            }
        }
        return original;
    }
}