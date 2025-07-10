class Solution {
    public int[] findArray(int[] pref) {
       int arr[] = new int[pref.length];
       int sum=0;
       int j=1;
       arr[0]=pref[0];
       int copy=pref[0];
       for(int i=1;i<pref.length;i++)
       {
         sum=pref[i]^copy;
         arr[j]=sum;
         copy=arr[j]^copy;
        // System.out.println(sum);
         j++;
       } 
       return arr;
    }
}