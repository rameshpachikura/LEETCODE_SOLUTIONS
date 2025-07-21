class Solution {
    public String makeFancyString(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char curr = s.charAt(i);

            if (!st.isEmpty() && st.peek() == curr) {
                // Look one step back to count how many repeats
                if (st.size() >= 2) {
                    char secondLast = st.get(st.size() - 2);
                    if (secondLast == curr) {
                        continue; // skip pushing third repeat
                    }
                }
            }
            st.push(curr);
        }

        // Convert stack to StringBuilder
        StringBuilder sb = new StringBuilder();
        for (char c : st) {
            sb.append(c);
        }

        return sb.toString();
    }
}
