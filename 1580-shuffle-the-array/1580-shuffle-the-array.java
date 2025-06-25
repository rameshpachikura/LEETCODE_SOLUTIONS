class Solution {
    public int[] shuffle(int[] nums, int n) {
       int x=nums.length;
       int[] a=new int[x];
       int y[]=new int[n];
       int[] z=new int[n];
       for(int i=0;i<n;i++){
           y[i]=nums[i];
       }
       for(int i=0;i<n;i++){
           z[i]=nums[n+i];
       }
       int c=0;
       int d=1;
       for(int i=0;i<n;i++){
          a[c]=y[i];
          a[d]=z[i];
          d=d+2;
          c=c+2;
       }
     return a;

    }
}