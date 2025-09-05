class Solution {
    public int makeTheIntegerZero(int num1, int num2) {
        for(int k = 0; k <= 60; k++){
            long target = (long)num1 - (long)k*num2;

            if(target < k) continue;

            int setBits = Long.bitCount(target); 
            if(setBits <= k) return k;
        }
        return -1;
    }
}