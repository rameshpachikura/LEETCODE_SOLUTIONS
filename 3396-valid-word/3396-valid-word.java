class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        if(n<3){
            return false;
        }
        int v=0;
        int c1=0;
        int d=0;
        for(int i=0;i<n;i++){
            int c=word.charAt(i);
            char ch=word.charAt(i);
            if(c>=97 && c<=122){
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u'){
                    c1++;
                }
                else{
                    v++;
                }
            }
            else if(c>=65 && c<=90){
                 if(ch=='A' || ch=='E' || ch=='I' || ch=='O'||ch=='U'){
                    c1++;
                }
                else{
                    v++;
                }
            }
            else if(c>=48 && c<=57){
                d++;
            }
            else{
                return false;
            }
        }
   
        if(v>0 && c1>0){
            return true;
        }
        return false;
    }
}