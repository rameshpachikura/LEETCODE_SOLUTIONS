class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      int n=candidates.length;
      List<List<Integer>> res=new ArrayList<>();
      backtrack(0,candidates,target,new ArrayList<>(),res);
      return res;   
    }
    void backtrack(int index,int[] nums,int target,List<Integer> p,List<List<Integer>> res){
      
        if(target==0){
            res.add(new ArrayList<>(p));
            return;
        }
        if(target<0 || index>=nums.length){
            return ;
        }
        p.add(nums[index]);
        backtrack(index,nums,target-nums[index],p,res);
        p.remove(p.size()-1);
        backtrack(index+1,nums,target,p,res);
    }
}