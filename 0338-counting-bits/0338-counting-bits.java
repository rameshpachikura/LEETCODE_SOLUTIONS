class Solution {
    public int[] countBits(int n) {
        int[] a=new int[n+1];
        int c;
        for(int i=0;i<n+1;i++){
            c=setBits(i);
             a[i]=c;
        }
        return a;
    }
    public int setBits(int n){
       int count = 0;
    while (n > 0) {
        if ((n & 1) == 1) count++;
        n = n >> 1;
    }
    return count;
    }
}