class Solution {
    public int minimizedStringLength(String s) {
        int n=s.length();
       HashSet<Character> hs=new HashSet<>();
       for(int i=0;i<n;i++){
        hs.add(s.charAt(i));
       }
       return hs.size();
    }
}