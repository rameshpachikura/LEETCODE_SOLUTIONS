class Solution {
    public String reverseVowels(String s) {
       HashSet<Character> hs=new HashSet<>();
       char[] ch={'a','e','i','o','u','A','E','I','O','U'};
       for(int i=0;i<ch.length;i++){
        hs.add(ch[i]);
       }
       ArrayList<Character> a=new ArrayList<>();
       for(int i=0;i<s.length();i++){
        if(hs.contains(s.charAt(i))){
            a.add(s.charAt(i));
        }
       } 
       StringBuilder sb=new StringBuilder();
       int n=a.size()-1;
       for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
                sb.append(a.get(n));
                n--;
            }
            else{
                sb.append(s.charAt(i));
            }
       }
       return sb.toString();
    }
}