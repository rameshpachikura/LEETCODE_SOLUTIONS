class Solution {
    public String restoreString(String s, int[] indices) {
       char[] c=new char[s.length()];
       char[] ch=s.toCharArray();
       for(int i=0;i<s.length();i++){
          int x=indices[i];
          c[x]=ch[i];
       }
       StringBuilder sb=new StringBuilder();
       for(int i=0;i<c.length;i++){
         sb.append(c[i]);
       }
       return sb.toString();
    }
}