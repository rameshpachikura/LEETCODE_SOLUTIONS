class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        HashSet<Integer> hs=new HashSet<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==key){
                for(int j=0;j<n;j++){
                    if(Math.abs(i-j)<=k){
                        hs.add(j);
                    }
                }
            }
        }
         ArrayList<Integer> a=new ArrayList<>(hs);
         Collections.sort(a);
         return a;
    }
}