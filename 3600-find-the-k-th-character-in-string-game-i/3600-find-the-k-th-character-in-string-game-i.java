class Solution {
    public char kthCharacter(int k) {
        String s="a";
        StringBuilder str1=new StringBuilder(s);
        while(s.length()<k){
            for(int i=0;i<s.length();i++){
                char ch1=(char)(s.charAt(i)+1);
                str1.append(ch1);
            }
            s=str1.toString();
            System.out.println(s);
        }
        return s.charAt(k-1);
    }
}