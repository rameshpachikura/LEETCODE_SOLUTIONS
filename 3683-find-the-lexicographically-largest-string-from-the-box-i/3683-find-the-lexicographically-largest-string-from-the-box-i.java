class Solution {
    public String answerString(String word, int numFriends) {
        int n = word.length();
        String ans = "";
        if(numFriends==1){
            return word;
        }

        for (int i = 0; i < n; ++i) {
            int k = Math.min(n - i, n - numFriends + 1);
            String t = word.substring(i, i + k);

            if (ans.equals("") || isGreater(t, ans)) {
                ans = t;
            }
        }

        return ans;
    }

    private boolean isGreater(String a, String b) {
        int len = Math.min(a.length(), b.length());

        for (int i = 0; i < len; i++) {
            if (a.charAt(i) > b.charAt(i)) return true;
            else if (a.charAt(i) < b.charAt(i)) return false;
        }

        return a.length() > b.length();
    }
}
