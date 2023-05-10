package leetcode2;

public class IslandPerimeter {

    public static void main(String[] args) {
        IslandPerimeter islandPerimeter = new IslandPerimeter();
        islandPerimeter.programLogic();
    }

    private void programLogic() {
        int[][] grid = {{0, 1, 0, 0}, {1, 1, 1, 0}, {0, 1, 0, 0}, {1, 1, 0, 0}};
        int i = 0, j = 0, row = 0, column = 0, k = 0, total = 0, sum = 0;
        int[][] moment = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        for (i = 0; i < grid.length; i++) {
            for (j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    sum = 4;
                    for (k = 0; k < moment.length; k++) {
                        row = moment[k][0] + i;
                        column = moment[k][1] + j;
                        if (row >= 0 && column >= 0 && row < grid.length && column < grid[0].length) {
                            if (grid[row][column] == 1)
                                sum -= 1;
                        }
                    }
                    total += sum;
                }
            }
        }
        System.out.println(total);
    }
}
