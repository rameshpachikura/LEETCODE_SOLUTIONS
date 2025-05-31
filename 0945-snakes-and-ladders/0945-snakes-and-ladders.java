class Solution {
    int n;
    public int[] getCor(int cor){
        int RFB = n-1 - (cor-1)/n;  // row form bottom -> I will find it from top and substract fromtotal
        int col = (cor-1)%n;
        if((n-1 - RFB)%2 ==1){
            col = n-1 - col;
        }
        return new int[]{RFB , col};

    }
    public int snakesAndLadders(int[][] board) {
         n = board.length;
        boolean [][]visited  = new boolean[n][n];
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        visited[n-1][0] = true;
        int steps = 0;
        while(!q.isEmpty()){
            int qSize = q.size();
            while(qSize-->0){
                int x = q.poll();  // retrives the front element 
                if(x==n*n){   // I have reached the end of the board
                    return steps;
                }
                for(int  k = 1 ; k<=6 ; k++ ){
                    int val = x+ k ;
                    if(val>n*n){
                        break;
                    }
                    int[] cor = getCor(val);  // get coordinate of val in board
                    int row = cor[0];
                    int col = cor[1];
                    if(visited[row][col]){
                        continue;
                    }
                    visited[row][col] = true;
                    if(board[row][col]==-1){  // if value is -1 i can go forward
                        q.add(val);
                    }
                    else {
                        q.add(board[row][col]);  // its either ladder or snake
                    }
                }
            }
            steps++;
        }

        return -1;
            }
}