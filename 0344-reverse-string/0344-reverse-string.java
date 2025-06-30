class Solution {
    public void reverseString(char[] s) {
        int n=s.length;
        int t1=0;
        int t2=n-1;
        while(t1<=t2){
            char x=s[t1];
            s[t1]=s[t2];
            s[t2]=x;
            t1++;
            t2--;
        }
    }
}