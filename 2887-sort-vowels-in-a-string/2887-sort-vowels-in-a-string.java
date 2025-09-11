class Solution {
    public String sortVowels(String s) {
        int[] a = new int[26];  
        int[] b = new int[26];  
        ArrayList<Integer> c = new ArrayList<>(); 
        int n = s.length();
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                a[ch - 'A']++;
                c.add(i);
            } else if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                b[ch - 'a']++;
                c.add(i);
            }
        }

        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (cnt < c.size() && i == c.get(cnt)) {
                boolean placed = false;
                for (int j = 0; j < 26; j++) {
                    if (a[j] > 0) {
                        sb.append((char) ('A' + j));
                        a[j]--;
                        cnt++;
                        placed = true;
                        break;
                    }
                }
                if (!placed) {
                    for (int j = 0; j < 26; j++) {
                        if (b[j] > 0) {
                            sb.append((char) ('a' + j));
                            b[j]--;
                            cnt++;
                            break;
                        }
                    }
                }
            } else {
                sb.append(s.charAt(i)); 
            }
        }

        return sb.toString();
    }
}
