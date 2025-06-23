class Solution {
    public int maxFreqSum(String s) {
          HashMap<Character,Integer> hm1=new HashMap<>();
           HashMap<Character,Integer> hm2=new HashMap<>();
           int m1=0;
           int m2=0;
           for(int i=0;i<s.length();i++){
               char ch=s.charAt(i);
               if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                hm1.put(ch,hm1.getOrDefault(ch,0)+1);
                m2=Math.max(m2,hm1.get(ch));
               }
               else{
                 hm2.put(ch,hm2.getOrDefault(ch,0)+1);
                 m1=Math.max(m1,hm2.get(ch));
               }
           }
           return m1+m2;

    }
}