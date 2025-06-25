class Solution {
    public int[] shuffle(int[] nums, int n) {
       int x=nums.length;
       int[] a=new int[x];
       int c=0;
       int d=1;
       for(int i=0;i<n;i++){
          a[c]=nums[i];
          a[d]=nums[(n+i)];
          d=d+2;
          c=c+2;
       }
     return a;

    }
}