class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int c=0;
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<jewels.length();i++){
            hs.add(jewels.charAt(i));
        }
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(hs.contains(ch)){
                c++;
            }
        }
        return c;
    }
}