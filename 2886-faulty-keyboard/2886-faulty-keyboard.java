class Solution {
    public String finalString(String s) {
       int n=s.length();
       StringBuilder sb=new StringBuilder();
       int x=0;
       for(int i=0;i<n;i++){
        char ch=s.charAt(i);
        if(ch=='i'){
            sb.reverse();
            x=i;
        }
        else{
            sb.append(ch);
        }
       } 
       return  sb.toString();
    }
}