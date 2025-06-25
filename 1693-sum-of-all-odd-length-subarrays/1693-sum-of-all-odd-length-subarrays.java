class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
       int total=0;
       int n=arr.length;
       int[] pre=new int[n];
       pre[0]=arr[0];
       for(int i=1;i<n;i++){
        pre[i]=pre[i-1]+arr[i];
       } 
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int len = j - i + 1;
                if (len % 2 == 1) {
                    int subSum = pre[j] - (i > 0 ? pre[i - 1] : 0);
                    total += subSum;
                }
            }
        }
    return total;
    }
}