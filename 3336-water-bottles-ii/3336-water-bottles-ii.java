class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
       int bd=numBottles;
       int eb=numBottles;
       int fb=0;

       while((eb+fb)>=numExchange){
           fb++;
           eb=eb-numExchange;
          numExchange=numExchange+1;
           System.out.println(fb+" "+eb+" "+numExchange+" "+bd);
       }
       return bd+fb;


    }
}