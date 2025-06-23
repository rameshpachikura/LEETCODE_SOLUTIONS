class Solution {
    public int findPermutationDifference(String s, String t) {
        int max=0;
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm1.put(s.charAt(i),i);
        }
        for(int i=0;i<t.length();i++){
            if(hm1.containsKey(t.charAt(i))){
                max+=Math.abs(hm1.get(t.charAt(i))-i);
            }
        }
        return max;
    }
}