class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] res=new int[m][n];
        int x=indices.length;
        for(int i=0;i<x;i++){
                int r=indices[i][0];
                int c=indices[i][1];
                for(int k=0;k<n;k++){
                    res[r][k]+=1;
                }
                for(int z=0;z<m;z++){
                    res[z][c]+=1;
            }
        }
        int cnt=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(res[i][j]);
                if(res[i][j]%2==1){
                    cnt++;
                }
            }
        }
        return cnt;

    
    }
}