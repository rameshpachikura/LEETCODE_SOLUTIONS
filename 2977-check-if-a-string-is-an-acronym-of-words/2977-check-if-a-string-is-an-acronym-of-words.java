class Solution {
    public boolean isAcronym(List<String> words, String s) {
        boolean x=true;
        int n=words.size();
        int cnt=0;
        int len=s.length();
        if(len!=n){
            return false;
        }
        for(int i=0;i<n;i++){
            String str=words.get(i);
            char ch=s.charAt(i);
            if(str.charAt(0)!=ch){
                x=false;
                break;
            }
        }
        return x;
    }
}