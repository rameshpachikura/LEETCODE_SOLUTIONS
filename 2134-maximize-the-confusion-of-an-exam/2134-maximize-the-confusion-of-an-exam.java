class Solution {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        int n=answerKey.length();
        int l=0;
        int t=0;
        int f=0;
        int ans=0;
        for(int r=0;r<n;r++){
            if(answerKey.charAt(r)=='T'){
                t++;
            }
            else{
                f++;
            }
            while(Math.min(t,f)>k){
                if(answerKey.charAt(l)=='T'){
                    t--;
                }
                else{
                    f--;
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);

        }
        return ans;
    }
}