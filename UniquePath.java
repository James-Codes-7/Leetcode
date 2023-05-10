package leetcode2;

import java.util.Scanner;

public class UniquePath {

    private Scanner scanner = new Scanner(System.in);
    private int totalPath = 0;

    public static void main(String[] args) {
        UniquePath uniquePath = new UniquePath();
      //  uniquePath.programLogic();
        uniquePath.logic2();
    }

    private void programLogic() {
        System.out.println("Enter the Row Size");
        int row = scanner.nextInt(), i = 0, j = 0;

        System.out.println("Enter the col Size");
        int col = scanner.nextInt();

        int[][] grid = new int[row][col];
        uniquePath(grid, 0, 0);
        System.out.println(totalPath);
    }

    private void uniquePath(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i > grid.length - 1 || j > grid[0].length - 1) return;
        else if (i == grid.length - 1 && j == grid[0].length - 1) totalPath++;
        else {
            uniquePath(grid, i, j + 1);
            uniquePath(grid, i + 1, j);
        }
    }

    private void logic2() {
        System.out.println("Enter the Row");
        int m = scanner.nextInt();

        System.out.println("Enter the column");
        int n = scanner.nextInt();
        if (n == 1 || m == 1) System.out.println(m < n ? n : m);
        int[][] matrix = new int[n - 1][m];
        int i = 0, j = 0, N = 1, sum = 0;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < m; j++) {
                if (i == 0) {
                    matrix[i][j] = N++;
                } else {
                    sum += matrix[i - 1][j];
                    matrix[i][j] = sum;
                }
            }
            sum=0;
        }
        System.out.println(matrix[n - 1 - 1][m - 1]);
    }
}
