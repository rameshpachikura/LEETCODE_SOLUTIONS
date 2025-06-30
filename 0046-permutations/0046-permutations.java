class Solution {
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        boolean[] used=new boolean[n];
        List<List<Integer>> res=new ArrayList<>();
        backtrack(0,nums,used,res,new ArrayList<>());
        return res;
    }
    void backtrack(int i,int[] nums,boolean[] used, List<List<Integer>> res,ArrayList<Integer> p){
        int n=nums.length;
        if(p.size()==n){
            res.add(new ArrayList<>(p));
            return ;
        }
        for(int j=0;j<n;j++){
            if(used[j]){
                continue;
            }
            p.add(nums[j]);
            used[j]=true;
            backtrack(i+1,nums,used,res,p);
            p.remove(p.size()-1);
            used[j]=false;
        }
    }
}