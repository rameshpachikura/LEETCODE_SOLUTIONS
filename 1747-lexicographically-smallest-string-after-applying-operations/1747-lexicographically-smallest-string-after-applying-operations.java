class Solution {
    public String findLexSmallestString(String s, int a, int b) {
        // we'll explore all possible results
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        
        visited.add(s);
        queue.add(s);
        
        String smallest = s;

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            if (curr.compareTo(smallest) < 0) {
                smallest = curr;
            }

            // Operation 1: Add to odd indices
            String added = addOperation(curr, a);
            if (visited.add(added)) {  // add() returns true if newly added
                queue.offer(added);
            }

            // Operation 2: Rotate right by b
            String rotated = rotateRight(curr, b);
            if (visited.add(rotated)) {
                queue.offer(rotated);
            }
        }

        return smallest;
    }

    private String addOperation(String s, int a) {
        char[] chars = s.toCharArray();
        for (int i = 1; i < chars.length; i += 2) {  // odd indices
            int d = chars[i] - '0';
            d = (d + a) % 10;
            chars[i] = (char)(d + '0');
        }
        return new String(chars);
    }

    private String rotateRight(String s, int b) {
        int n = s.length();
        b = b % n;
        return s.substring(n - b) + s.substring(0, n - b);
    }
}