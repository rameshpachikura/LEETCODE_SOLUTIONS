class Solution {
    public String truncateSentence(String s, int k) {
        String[] str=s.split(" ");
        int c=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<k;i++){
            sb.append(str[i]);
            c++;
            if(c==k){
                break;
            }
            sb.append(" ");
        }
        return sb.toString();
        
    }
}