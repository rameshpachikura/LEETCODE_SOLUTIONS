class Solution {
    public int numberOfPairs(int[][] points) {
        int n=points.length;
        Arrays.sort(points,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(b[1],a[1]);
            }
            return Integer.compare(a[0],b[0]);
        });
        int ans=0;
        for(int i=0;i<n;i++){
            int ly=points[i][1];
            int min=Integer.MIN_VALUE;
            for(int j=i+1;j<n;j++){
                int ry=points[j][1];
                if(min<ry && ly>=ry){
                    ans++;
                    min=ry;
                }
                if(ly==ry){
                    break;
                }
            }
        }
        return ans;
    }
}