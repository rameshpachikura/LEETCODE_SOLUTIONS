class Solution {
    public String reversePrefix(String word, char ch) {
        int n=word.length();
        int j=-1;
        for(int i=0;i<n;i++){
            if(word.charAt(i)==ch){
                j=i;
                break;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int i=j;i>=0;i--){
            sb.append(word.charAt(i));
        }
        String s=word.substring(j+1);
        sb.append(s);
        return sb.toString();
    }
}