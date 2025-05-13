class Solution {
    public int lengthAfterTransformations(String s, int t) {
        /* StringBuilder sb = new StringBuilder();
        for(int i=0;i<t;i++)
        {
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(j) == 'z') sb.append("ab");
                else sb.append((char)(s.charAt(j) + 1));
            }
            s = sb.toString();
            sb.setLength(0);
        }
        return s.length(); */

        int[] count = new int[26];
        int MOD = 1000000007; 
        for(char c : s.toCharArray())
        {
            count[c - 'a']++;
        }

        for(int step=0;step<t;step++)
        {
            int[] after_step = new int[26];
            for (int i = 0; i < 26; i++) {
                if (count[i] > 0) {
                    if (i == 25) {  
                        after_step[0] = (after_step[0] + count[i]) % MOD;  
                        after_step[1] = (after_step[1] + count[i]) % MOD;  
                    } else {
                        after_step[i + 1] = (after_step[i+1] + count[i]) % MOD; 
                    }
                }
            }
        count = after_step;
        }
        int length = 0;
        for(int num : count)
        {
            length = (length + num) % MOD;
        }
        return length;
    }
}