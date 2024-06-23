public class _200_Number_of_Islands_2 {
    private boolean visited[][] = new boolean[300][300];
    private int columns, rows;
    public int numIslands(char[][] grid) {
        int result = 0;
        rows = grid.length;
        columns = grid[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if(grid[i][j] == '1' && !visited[i][j]) {
                    ++result;
                    DFS(grid, i, j);
                }
            }
        }
        return result;
    }

    public boolean isValid(int i, int j) {
        return i >= 0 && j >= 0 && i < rows && j < columns;
    }
    public void DFS(char[][] grid, int i, int j) {
        // Dieu kien dung | Cong thuc co so
        if(!isValid(i, j))
            return;
        if(grid[i][j] == '0' || visited[i][j])
            return;

        visited[i][j] = true;
        // De quy | Cong thuc truy hoi
        DFS(grid, i, j + 1);
        DFS(grid, i, j - 1);
        DFS(grid, i + 1, j);
        DFS(grid, i - 1, j);
    }


    public static void main(String[] args) {

    }
}
