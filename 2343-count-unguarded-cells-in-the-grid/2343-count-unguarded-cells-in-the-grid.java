class Solution {
    public static void isMarkGuard(int graph[][], int row, int col) {
        //Up
        for(int i = row-1; i >= 0; i--) {
            if(graph[i][col] == 2 || graph[i][col] == 3) {
                break;
            }

            graph[i][col] = 1; //MAking is A Guaded
        }

        //Down
        for(int i = row+1; i < graph.length; i++) {
            if(graph[i][col] == 2 || graph[i][col] == 3) {
                break;
            }

            graph[i][col] = 1; //MAking is A Guaded
        }

         //Left
        for(int j = col-1; j >=0; j--) {
            if(graph[row][j] == 2 || graph[row][j] == 3) {
                break;
            }

            graph[row][j] = 1; //MAking is A Guaded
        }

        //Right
        for(int j = col+1; j < graph[0].length; j++) {
            if(graph[row][j] == 2 || graph[row][j] == 3) {
                break;
            }

            graph[row][j] = 1; //MAking is A Guaded
        }
    }

    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        int graph[][] = new int[m][n];

        // Mark Guard Position
        for (int guard[] : guards) {
            int i = guard[0];
            int j = guard[1];

            graph[i][j] = 2; // Guard
        }

        //Mark Walls Position
        for(int wall[] : walls) {
            int i = wall[0];
            int j = wall[1];

            graph[i][j] = 3; //Wall
        }

        
        for(int guard[] : guards) {
            int i = guard[0];
            int j = guard[1];

            isMarkGuard(graph, i , j); //Guard
        }

        int ans = 0;

        for(int i = 0; i < graph.length; i++) {
            for(int j = 0; j < graph[0].length; j++) {
                if(graph[i][j] == 0) {
                    ans++;
                }
            }
        }

        return ans;
    }
}