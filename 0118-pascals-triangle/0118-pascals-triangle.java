class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> firstrow=new ArrayList<>();
        firstrow.add(1);
        res.add(firstrow);
        for(int i=1;i<numRows;i++){
            List<Integer> temp=new ArrayList<>();
            temp.add(1);
            for(int j=1;j<i;j++){
                int val=0;
                val=res.get(i-1).get(j)+res.get(i-1).get(j-1);
                temp.add(val);
            }
            temp.add(1);
            res.add(temp);
        }
        return res;
    }
}