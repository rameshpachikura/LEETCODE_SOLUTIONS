class Solution {
    public int possibleStringCount(String word) {
        int n=word.length();
        int c=0;
        for(int i=n-2;i>=0;i--){
            char ch1=word.charAt(i);
            char ch2=word.charAt(i+1);
            if(ch1==ch2){
                c++;
            }           
        }
        
        
        return c+1;
    }
}