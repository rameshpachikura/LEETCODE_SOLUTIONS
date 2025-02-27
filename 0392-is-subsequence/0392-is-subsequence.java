class Solution {
    public boolean isSubsequence(String s, String t) {
        int t1=0,t2=0;
        char[] ch1=s.toCharArray();
        char[] ch2=t.toCharArray();
        while((t1<s.length()) && (t2<t.length())){
            if(ch1[t1]==ch2[t2]){
                t1++;
                t2++;
            }
            else{
                t2++;
            }
        }
        if(t1==s.length()){
            return  true;
        }
        else{
            return false;
        }
    }
}