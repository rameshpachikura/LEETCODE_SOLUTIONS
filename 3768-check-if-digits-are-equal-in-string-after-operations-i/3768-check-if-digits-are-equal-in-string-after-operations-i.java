class Solution {
    public String operation(String s,int n){
        StringBuilder str=new StringBuilder();
        for(int i=1;i<n;i++){
            int x=s.charAt(i-1)-'0';
            int y=s.charAt(i)-'0';
            str.append((x+y)%10);
        }
        return str.toString();
    }
    public boolean hasSameDigits(String s) {
        int n=s.length();
        String ns=" ";
        while(n!=2){
         ns=operation(s,n);
         n=ns.length();
         s=ns;
        }
        boolean x=false;
        if(ns.charAt(0)==ns.charAt(1)){
            x=true;
        }
        return x;
    }
}