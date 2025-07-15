class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            a.add(nums[i]);
        }
        HashSet<Integer> hs=new HashSet<>(a);
        for(int i=0;i<nums.length;i++){
             int x=reverse(nums[i]);
             hs.add(x);
        }
        return hs.size();
    }
    public int reverse(int n){
        StringBuilder s=new StringBuilder();
        while(n>0){
            int r=n%10;
            s.append(r);
            n=n/10;
        }
        int x=Integer.parseInt((s.toString()));
        return x;
    }
}