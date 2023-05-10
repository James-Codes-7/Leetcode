package leetcode2;

import java.util.Scanner;

public class MinimumSum {

    private Scanner scanner = new Scanner(System.in);
    private int minimumSum = 0;
    private int[][] moment = {{0, 1}, {1, 0}};

    public static void main(String[] args) {
        MinimumSum minimumSum = new MinimumSum();
        //minimumSum.programLogic();
        minimumSum.logic2();
    }

    private void programLogic() {

        System.out.println("Enter the Row Size");
        int row = scanner.nextInt();
        System.out.println("Enter the Column size");
        int columnSize = scanner.nextInt(), i = 0, j = 0, sum = 0;
        int[][] grid = new int[row][columnSize];
        System.out.println("Enter the elements to the grid");
        for (i = 0; i < row; i++) {
            for (j = 0; j < columnSize; j++) {
                grid[i][j] = scanner.nextInt();
                sum += grid[i][j];
            }
        }

        minimumSum = sum;
        findMinimumSum(grid, 0, 0, grid[0][0]);
        System.out.println(minimumSum);
    }

    private void logic2() {
        System.out.println("Enter the Row Size");
        int row = scanner.nextInt();
        System.out.println("Enter the Column size");
        int col = scanner.nextInt(), i = 0, j = 0, sum = 0;
        int[][] grid = new int[row][col];
        System.out.println("Enter the elements to the grid");
        for (i = 0; i < row; i++) {
            for (j = 0; j < col; j++) {
                grid[i][j] = scanner.nextInt();
                sum += grid[i][j];
            }
        }
        int[][] dp = new int[row][col];

        for (i = row - 1; i >= 0; i--) {
            for (j = col - 1; j >= 0; j--) {
                if (i == row - 1 && j == col - 1) {
                    dp[i][j] = grid[i][j];
                } else if (i == row - 1) {
                    dp[i][j] = dp[i][j + 1] + grid[i][j];
                } else if (j == col - 1) {
                    dp[i][j] = dp[i + 1][j] + grid[i][j];
                } else {
                    dp[i][j] = Math.min(dp[i][j + 1], dp[i + 1][j]) + grid[i][j];
                }
            }
        }

        System.out.println(dp[0][0]);
    }

    private void findMinimumSum(int[][] grid, int i, int j, int total) {
        int row = 0, col = 0;
        for (int k = 0; k < moment.length; k++) {
            row = i + moment[k][0];
            col = j + moment[k][1];
            if (row >= 0 && row < grid.length && col >= 0 && col < grid[0].length) {
                if (row == grid.length - 1 && col == grid[0].length - 1) {
                    total += grid[row][col];
                    if (total < minimumSum)
                        minimumSum = total;
                    total -= grid[row][col];
                } else {
                    total += grid[row][col];
                    findMinimumSum(grid, row, col, total);
                    total -= grid[row][col];
                }
            }
        }
    }

}
