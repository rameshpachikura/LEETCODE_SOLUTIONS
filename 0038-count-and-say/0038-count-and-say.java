class Solution {
    public String countAndSay(int n) {
        
        if(n==1)
        return "1";

        String val = countAndSay(n-1);
        // edge case where val.length() is 1
        if(val.length()==1){
            return "1"+val;
        }

        StringBuilder builder = new StringBuilder();
        int count = 1;
        //check two consecutive characters of val
        for(int i=0;i<val.length()-1;i++){
            while(i<val.length()-1&&(val.charAt(i)==val.charAt(i+1))){
                count++;
                i++;
            }
            builder.append(count);
            builder.append(val.charAt(i));
            count = 1;
        }
        if(val.charAt(val.length()-1)!=builder.charAt(builder.length()-1)){
            builder.append(1);
            builder.append(val.charAt(val.length()-1));
        }
        
        return builder.toString();
    }
}