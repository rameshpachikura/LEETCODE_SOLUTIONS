class Solution {
    public int balancedStringSplit(String s) {
        int l=0,r=0;
        int c=0;
        int n=s.length();
        char ch1='R';
        char ch2='L';
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(ch==ch1){
                if(l==r){
                    c++;
                    l=0;
                    r=0;
                }
                r++;
            }
            else{
                 if(l==r){
                    c++;
                    l=0;
                    r=0;
                }
                l++;
            }

        }
        return c;
    }
}