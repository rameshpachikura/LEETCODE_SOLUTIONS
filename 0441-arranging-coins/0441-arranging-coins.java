class Solution {
    public int arrangeCoins(int n) {
       int ans=helper(n,1);
       return ans; 
    }
    int helper(int n,int i){
        if(n<i){
            return i-1;
        }
        //System.out.println(n-i+" "+(i+1));
        return helper(n-i,i+1);
    }
}