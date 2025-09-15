class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
       String[] words=text.split(" ");
      HashSet<Character> hs=new HashSet<>();
      int res=0;
      for(int i=0;i<brokenLetters.length();i++){
        hs.add(brokenLetters.charAt(i));
      }
       for(int i=0;i<words.length;i++){
           int cnt=0;
           for(int j=0;j<words[i].length();j++){
               if(hs.contains(words[i].charAt(j))){
                cnt++;
                break;
               }
           }
           if(cnt>=1){
                 res++;
           }
       }
       return words.length-res;

    }
}