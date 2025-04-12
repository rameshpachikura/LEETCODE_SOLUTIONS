class Solution {
    public boolean isHappy(int n) {
      Set<Integer> seen = new HashSet<>();
        
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
            n = helper(n);
        }
        
        return n == 1;

    }
    public int helper(int x){
        int sum=0;
        while(x>0){
            int r=x%10;
            sum+=r*r;
            x=x/10;
        }
        return sum;
    }
}