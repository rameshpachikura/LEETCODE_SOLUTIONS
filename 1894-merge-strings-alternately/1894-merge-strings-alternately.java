class Solution {
    public String mergeAlternately(String word1, String word2) {
       int n1=word1.length();
       int n2=word2.length();
       StringBuilder str=new StringBuilder();
       int t1=0,t2=0;
       for(int i=0;i<n1;i++){
            if(t1<n1){
                str.append(word1.charAt(i));
                t1++;
            }
            if(t2<n2){
                str.append(word2.charAt(i));
                t2++;
            }
       }
       while(t2<n2){
        str.append(word2.charAt(t2));
        t2++;
       }
       return str.toString();
       

    }
}