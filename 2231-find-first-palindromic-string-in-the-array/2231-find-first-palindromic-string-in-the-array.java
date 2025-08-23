class Solution {
    public String firstPalindrome(String[] words) {
        int n=words.length;
        for(int i=0;i<n;i++){
            String w=words[i];
            int t1=0;
            int t2=w.length()-1;
            boolean x=true;
            while(t1<=t2){
                if(w.charAt(t1)==w.charAt(t2)){
                    t1++;
                    t2--;
                }
                else{
                    x=false;
                    break;
                }
            }
            if(x){
                return words[i];
            }

        }
        return "";
    }
}