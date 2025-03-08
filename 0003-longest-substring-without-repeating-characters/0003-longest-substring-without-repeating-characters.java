class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int l=0,r=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        int len=Integer.MIN_VALUE;
        if(n==0){
            return 0;
        }
        while(r<n){
            if(hm.containsKey(s.charAt(r))){
                if(hm.get(s.charAt(r))>=l){
                     l=hm.get(s.charAt(r))+1;
                }
                hm.put(s.charAt(r),r);
            }
                len=Math.max(len,r-l+1);
                hm.put(s.charAt(r),r);
                r++;
        }
        return len;
    }
}