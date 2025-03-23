class Solution {
    public int minimumCost(int[] cost) {
     int n=cost.length;
     Arrays.sort(cost);
     int sum=0;
     int c=0;
     for(int i=n-1;i>=0;i--){
        if(c==2){
            c=0;
        }
        else{
            sum+=cost[i];
            c++;
        }
     }
     return sum;
    }
}