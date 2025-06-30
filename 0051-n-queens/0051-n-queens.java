class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res=new ArrayList<>();
        char[][] b=new char[n][n];
        for(int i=0;i<n;i++){
            Arrays.fill(b[i],'.');
        }
        backtrack(0,b,res,new HashSet<>(),new HashSet<>(),new HashSet<>());
        return res;
    }
    void backtrack(int row,char[][] board,List<List<String>> result,Set<Integer> cols, Set<Integer> diag1, Set<Integer> diag2){
        int n=board.length;
        if (row == n) {
            List<String> config = new ArrayList<>();
            for (char[] r : board) {
                config.add(new String(r));
            }
            result.add(config);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (cols.contains(col) || diag1.contains(row + col) || diag2.contains(row - col))
                continue;
             board[row][col] = 'Q';
            cols.add(col);
            diag1.add(row + col);
            diag2.add(row - col);

            backtrack(row + 1, board, result, cols, diag1, diag2);

            // Backtrack
            board[row][col] = '.';
            cols.remove(col);
            diag1.remove(row + col);
            diag2.remove(row - col);    
        }
    }
}