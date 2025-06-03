class Solution {
    public int maxCandies(int[] status, int[] candies, int[][] keys, int[][] containedBoxes, int[] initialBoxes) {
        int n = status.length;
        Queue<Integer> q = new LinkedList<>();
        for (int start : initialBoxes) {
            q.offer(start); // Start with initial boxes
        }
        Set<Integer> closed = new HashSet<>();
        int total = 0;

        while (!q.isEmpty()) {
            int curr = q.poll();
            if (status[curr] == 0) { // Box is closed \U0001f622
                closed.add(curr);
                continue;
            }

            // Box is open! Time to party! \U0001f389
            // 1. Collect keys and reopen closed boxes
            for (int open : keys[curr]) {
                status[open] = 1; // Unlock the box
                if (closed.contains(open)) { // Was waiting? Requeue!
                    q.offer(open);
                    closed.remove(open);
                }
            }

            // 2. Grab all candies \U0001f36c
            total += candies[curr];

            // 3. Add contained boxes to the queue
            for (int nbr : containedBoxes[curr]) {
                q.offer(nbr);
            }
        }

        return total;
    }
}