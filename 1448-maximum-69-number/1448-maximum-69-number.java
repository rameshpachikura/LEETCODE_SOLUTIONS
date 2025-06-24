class Solution {
    public int maximum69Number (int num) {
        String s=String.valueOf(num);
        StringBuilder str=new StringBuilder();
        int c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='6' && c==0){
                str.append('9');
                c++;
            }
            else{
                str.append(ch);
            }
        }
        int n=Integer.parseInt(str.toString());
        return n;
    }
}