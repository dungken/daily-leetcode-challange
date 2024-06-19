package graph;

public class _200_Number_of_Islands {
    boolean mark[][] = new boolean[300][300]; // Mang danh dau da duyet
    int numberColums, numberRows; // So cot va so hang cua ma tran grid

    // Kiem tra chi so i va j co hop le hay khong
    public boolean isValid(int i, int j) {
        return i >= 0 && j >= 0 && i < numberRows && j < numberColums;
    }

    // Thuat toan DFS duyet va danh dau cac dinh v lan can
    public void DFS(char[][] grid, int i, int j) {
        // B1: Dieu kien dung | Bai toan co so
        if(!isValid(i, j))
            return;
        if(grid[i][j] == '0' || mark[i][j])
            return;

        // Danh dau da duyet
        mark[i][j] = true;
        // B2: Cong thuc truy hoi | De quy
        DFS(grid, i, j + 1);
        DFS(grid, i, j - 1);
        DFS(grid, i + 1, j);
        DFS(grid, i - 1, j);
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        numberRows = grid.length;
        numberColums = grid[0].length;

        for (int i = 0; i < numberRows; i++) {
            for (int j = 0; j < numberColums; j++) {
                if(grid[i][j] == '1' && !mark[i][j]) {
                    ++count;
                    DFS(grid, i, j);
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {

    }
}
