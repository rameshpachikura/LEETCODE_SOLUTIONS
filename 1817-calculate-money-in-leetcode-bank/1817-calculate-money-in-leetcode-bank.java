class Solution {
    public int totalMoney(int n) {
        if(n<8){
            return n*(n+1)/2;
        }
        int q=n/7;
        int temp=q;
        int r=n%7;
        int cnt=1;
        int res=0;
        int ans=1;
        while(q-->0){
           int c=1;
           while(c!=8){
              res+=cnt;
              cnt++;
              c++;
           }
           ans=ans+1;
           cnt=ans;
        }
        System.out.println(ans);
        while(r-->0){
            res+=ans;
            ans=ans+1;
        }
       
        
        return res;
    }
}