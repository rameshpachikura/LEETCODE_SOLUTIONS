class Solution {
    public int[] sumZero(int n) {
        int[] a=new int[n];
        int c=0;
        for(int i=1;i<(n/2)+1;i++){
            a[c++]=i;
            a[c++]=-i;
        }
        if(n%2!=0){
            a[c++]=0;
        }
        return a;
    }
}