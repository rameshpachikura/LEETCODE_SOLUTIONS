class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),res);
        return res;
    }
    public void backtrack(int i,int[] nums,List<Integer> p,List<List<Integer>> res){
        res.add(new ArrayList<>(p));
        for(int j=i;j<nums.length;j++){
            p.add(nums[j]);
            backtrack(j+1,nums,p,res);
            p.remove(p.size()-1);
        }

    }
}