class Solution {
    public long maxSum(int[][] grid, int[] limits, int k) {
        int n=grid.length;
        int m=grid[0].length;
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(limits[i]>0){
                int[] r=grid[i];
                Arrays.sort(r);
                for(int j=m-limits[i];j<m;j++){
                    a.add(r[j]);
                }
            }
        }
        Collections.sort(a);
        long sum=0;
        for(int i=a.size()-k;i<a.size();i++){
            sum+=a.get(i);
        }
        return sum;
    }
}