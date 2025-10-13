class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb=new StringBuilder();
       int i=num1.length()-1;
       int j=num2.length()-1;
       int carry=0;
        while(i>=0 || j>=0 || carry!=0)
        {
            int digit1=0,digit2=0;
            if(i>=0){
                digit1=num1.charAt(i)-'0';
            }else{
                digit1=0;
            }
            if(j>=0){
                digit2=num2.charAt(j)-'0';
            }else{
                digit2=0;
            }
            int sum=digit1+digit2+carry;
            
            carry=sum/10;
            sb.append(sum%10);
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}