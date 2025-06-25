class Solution {
    public int maximumWealth(int[][] accounts) {
        int max=0;
        for(int[] rows:accounts){
            int len=rows.length;
            int sum=0;
            for(int i=0;i<len;i++){
                sum+=rows[i];
            }
            max=Math.max(sum,max);
            sum=0;
        }
        return max;
    }
}