class Solution {
    public String[] divideString(String s, int k, char fill) {
  int y = (s.length() % k == 0) ? s.length() / k : (s.length() / k) + 1;
        String[] str=new String[y];
        int c=0;
        int x=0;
        StringBuilder s1=new StringBuilder();
        for(int i=0;i<s.length();i++){
            s1.append(s.charAt(i));
            if(s1.length()==k){
                str[c++]=s1.toString();
                s1.setLength(0);
            }
            if(s1.length()!=0 && i==s.length()-1){
                while(s1.length()!=k){
                    s1.append(fill);
                }
                str[c++]=s1.toString();
              
            }
        }
        return str;

    }
}