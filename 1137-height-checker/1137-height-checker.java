class Solution {
    public int heightChecker(int[] heights) {
        int n=heights.length;
        int c=0;
        int[] a=new int[n];
       
        for(int i=0;i<n;i++){
            a[i]=heights[i];
        }
         Arrays.sort(heights);
        for(int i=0;i<n;i++){
            if(a[i]!=heights[i]){
                c++;
            }
        }
        return c;
    }
}