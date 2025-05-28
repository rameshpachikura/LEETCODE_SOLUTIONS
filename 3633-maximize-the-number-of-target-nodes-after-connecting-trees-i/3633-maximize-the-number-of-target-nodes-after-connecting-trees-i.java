class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        // Build adjencency list for graph represented by edges2
        List<Integer>[] g2 = build(edges2);
        int m = edges2.length + 1;
        int t = 0;

        // Calculate the maximum number of nodes reachable in graph2 within k-1 moves
        for (int i = 0; i < m; ++i) {
            t = Math.max(t, dfs(g2, i, -1, k -1));
        }

        // Build adjacency list for graph represented by edges1
        List<Integer>[] g1 = build(edges1);
        int n = edges1.length + 1;
        int[] answer = new int[n];
        // Initialize answer array wiith the maximum nodes reachable from graph2
        Arrays.fill(answer, t);

        // Calculate the overall maximum nodes reachable for each node in graph1 with extra move
        for (int i = 0; i < n; ++i) {
            answer[i] += dfs(g1, i, -1, k);
        }
        return answer;
    }

    // Constructs an adjacency list from edge array
    private List<Integer>[] build(int[][] edges) {
        int numOfNodes = edges.length + 1;
        List<Integer>[] graph = new List[numOfNodes];
        Arrays.setAll(graph, i -> new ArrayList<>());

            // Add edges to the adjacency list
            for (var edge: edges) {
                int a = edge[0], b = edge[1];
                graph[a].add(b);
                graph[b].add(a);
            }
            return graph;
    }

    // Depth First search to count nodes reachable within d moves
    private int dfs(List<Integer>[] graph, int currentNode, int parentNode, int remainingMoves){
        if (remainingMoves < 0) {
            return 0;
        }

        int count = 1; // Count current node
        for (int adjacentNode : graph[currentNode]) {
            if (adjacentNode != parentNode) { // Avoid revisiting the parent node
                count += dfs(graph, adjacentNode, currentNode, remainingMoves - 1);
            }
        }
        return count;
    }
}