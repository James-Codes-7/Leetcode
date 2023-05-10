package leetcode3;

public class NumberOfIslands {

    public static void main(String[] args) {
        NumberOfIslands numberOfIslands = new NumberOfIslands();
       // numberOfIslands.programLogic();
        numberOfIslands.logic2();
    }

    private int[][] moment = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

    private void programLogic() {
        char[][] grid = {{'1', '1', '1', '1', '1',}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        int i = 0, j = 0, row = grid.length, column = grid[0].length, count = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    islandCheck(grid, i, j);
                    count++;
                }
            }
        }
        System.out.println(count);
    }


    private void islandCheck(char[][] island, int i, int j) {
        int row = 0, col = 0;
        for (int k = 0; k < moment.length; k++) {
            row = i + moment[k][0];
            col = j + moment[k][1];
            if (row >= 0 && col >= 0 && row < island.length && col < island[0].length) {
                if (island[row][col] == '1') {
                    island[row][col] = '2';
                    islandCheck(island, row, col);
                }
            }
        }
    }

    private void logic2() {
        char[][] grid = {{'1', '1', '1', '1', '1',}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        int i = 0, j = 0, row = grid.length, column = grid[0].length, count = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    if (check(grid, i, j)) {
                        count++;
                    }
                    grid[i][j] = '2';
                }
            }
        }
        System.out.println(count);
    }

    private boolean check(char[][] grid, int i, int j) {
        int row = 0, col = 0;
        for (int k = 0; k < moment.length; k++) {
            row = i + moment[k][0];
            col = j + moment[k][1];
            if (row >= 0 && col >= 0 && row < grid.length && col < grid[0].length) {
                if (grid[row][col] == '2')
                    return false;
            }
        }
        return true;
    }
}
