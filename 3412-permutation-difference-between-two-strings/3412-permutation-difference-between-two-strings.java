class Solution {
    public int findPermutationDifference(String s, String t) {
        int max=0;
        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            for(int j=0;j<t.length();j++){
                if(ch1==t.charAt(j)){
                    max+=Math.abs(i-j);
                }
            }
        }
        return max;
    }
}