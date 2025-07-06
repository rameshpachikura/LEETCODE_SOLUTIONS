class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
      int n=A.length;
      int[] c=new int[n];
      HashSet<Integer> hs=new HashSet<>();
      for(int i=0;i<n;i++){
         hs.add(A[i]);
         int x=0;
         for(int j=0;j<=i;j++){
            if(hs.contains(B[j])){
                x++;
            }
         }
         c[i]=x;
      }   
      return c;
    }
}