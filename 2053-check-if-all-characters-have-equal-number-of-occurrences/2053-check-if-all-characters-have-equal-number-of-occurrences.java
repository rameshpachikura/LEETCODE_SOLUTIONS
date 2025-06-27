class Solution {
    public boolean areOccurrencesEqual(String s) {
       HashMap<Character,Integer> hm=new HashMap<>();
       int max=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        hm.put(ch,hm.getOrDefault(ch,0)+1);
        max=Math.max(max,hm.get(ch));
       } 
       for(char keys:hm.keySet()){
          int x=hm.get(keys);
          if(x!=max){
            return false;
          }
       }
        return true;
    }
}