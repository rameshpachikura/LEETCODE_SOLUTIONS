class Solution {
    public String convertDateToBinary(String date) {
      StringBuilder str=new StringBuilder();
      String[] s=new String[3];
      int c=0;
      for(int i=0;i<date.length();i++){
        if(date.charAt(i)=='-'){
              s[c++]=str.toString();
              str.setLength(0);
           }
           else{
                str.append(date.charAt(i));   
           }
               
        }
        s[c] = str.toString();
        int x=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length;i++){
             int y=Integer.parseInt(s[i]);
             sb.append(Integer.toBinaryString(y));
             if(x<2){
                sb.append('-');
                x++;
             }
        } 
        return sb.toString();  
    }
}