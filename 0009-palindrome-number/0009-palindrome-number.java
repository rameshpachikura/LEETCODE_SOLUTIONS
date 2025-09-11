class Solution {
    public boolean isPalindrome(int x) {
        String str=Integer.toString(x);
        StringBuilder sb=new StringBuilder(str);
        String str1=sb.reverse().toString();
        return str.equals(str1);
    }
}