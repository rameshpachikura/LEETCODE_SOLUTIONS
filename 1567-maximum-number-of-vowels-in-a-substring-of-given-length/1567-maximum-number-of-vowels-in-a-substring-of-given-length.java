class Solution {
    public int maxVowels(String s, int k) {
        char[] ch = {'a','e','i','o','u'};

        HashSet<Character> hs = new HashSet<>();
        for (int i = 0; i < ch.length; i++) {
            hs.add(ch[i]); 
        }
       int l=0;
       int cnt=0;
       int ans=0;
       for(int r=0;r<s.length();r++){
           if(hs.contains(s.charAt(r))){
            cnt++;
           }
           if((r-l+1)==k){
               ans=Math.max(cnt,ans);
               if(hs.contains(s.charAt(l))){
                    cnt--;
                    } 
               l++;
           }

       }
       return ans;

    }
}