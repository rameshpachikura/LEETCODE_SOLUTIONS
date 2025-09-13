class Solution {
    public int maxFreqSum(String s) {
        int[] a=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            a[ch-'a']++;
        }
        int mv=0;
        int mc=0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 ||i==20){
                mv=Math.max(a[i],mv);
            }
            else{
              mc=Math.max(a[i],mc);  
            }
        }
        return mc+mv;
    }
}