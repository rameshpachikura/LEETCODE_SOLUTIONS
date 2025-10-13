class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
       int n=image.length;
       int m=image[0].length;
       int[][] a=new int[n][m];
       int x=0;
       for(int i=0;i<n;i++){
           int y=0;
           for(int j=m-1;j>=0;j--){
               a[x][y++]=image[i][j];
           }
           x=x+1;
       }
       for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
            if(a[i][j]==0){
                a[i][j]=1;
            }
            else{
                a[i][j]=0;
            }
         }
       }
       return a;

    }
}