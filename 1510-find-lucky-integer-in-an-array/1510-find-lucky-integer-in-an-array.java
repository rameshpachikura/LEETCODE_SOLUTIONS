class Solution {
    public int findLucky(int[] arr) {
       int n=arr.length;
       int max=0;
       for(int i=0;i<n;i++){
        max=Math.max(max,arr[i]);
       }
       int[] c=new int[max+1];
       for(int i=0;i<n;i++){
          c[arr[i]]++;
       }
       for(int i=c.length-1;i>=0;i--){
           if(i==c[i] && i>0){
               return i;
           }
       }
       return -1;

    }
}