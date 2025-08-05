class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        boolean[] a=new boolean[n];
        Arrays.fill(a,false);
        int cnt=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(baskets[j]>=fruits[i] && a[j]!=true){
                    a[j]=true;
                    cnt++;
                    break;
                }
            }
        }
        return n-cnt;
    }
}