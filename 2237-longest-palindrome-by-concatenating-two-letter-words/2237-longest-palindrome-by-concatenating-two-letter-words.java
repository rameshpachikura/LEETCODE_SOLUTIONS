class Solution {
    public int longestPalindrome(String[] words) {
       int n=words.length;
       int[][] f=new int[26][26];
       int cnt=0;
       for(int i=0;i<n;i++){
        int a=words[i].charAt(0)-'a';
        int b=words[i].charAt(1)-'a';
        if(f[b][a]>0){
            cnt+=4;
            f[b][a]--;
        }
        else{
            f[a][b]++;
        }
       }
       for(int i=0;i<26;i++){
          if(f[i][i]>0){
            cnt+=2;
            break;
          }
       }
       return cnt;
    }
}