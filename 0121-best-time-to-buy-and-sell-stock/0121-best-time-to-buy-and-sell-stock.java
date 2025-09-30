class Solution {
    public int maxProfit(int[] prices) {
      int n=prices.length;
      int p=0;
      for(int i=0;i<n;i++){
          int buy=prices[i];
          for(int j=i+1;j<n;j++){
            int sell=prices[j];
            p=Math.max(p,sell-buy);
          }
      }
      return p;
      

    }
}