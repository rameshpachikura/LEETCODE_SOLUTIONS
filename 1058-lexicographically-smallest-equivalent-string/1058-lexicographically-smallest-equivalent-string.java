class Solution {
    int[] parent = new int[26];

    private int find(int x){
        return parent[x] == x ? x : (parent[x] = find(parent[x]));
    }

    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        
        for (int i = 0; i < 26; i++) parent[i] = i;

        for (int i = 0; i < s1.length(); i++) {
            int x = find(s1.charAt(i) - 'a');
            int y = find(s2.charAt(i) - 'a');
            if (x != y) parent[Math.max(x, y)] = Math.min(x, y);
        }

        StringBuilder sb = new StringBuilder();
        for (char ch : baseStr.toCharArray())
            sb.append((char) (find(ch - 'a') + 'a'));
        return sb.toString();
    }
}