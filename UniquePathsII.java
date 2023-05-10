package leetcode3;

public class UniquePathsII {

    public static void main(String[] args) {
        UniquePathsII uniquePathsII = new UniquePathsII();
        uniquePathsII.programLogic();
    }

    private void programLogic() {

        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int i = 0, j = 0;
        int[][] matrix = new int[obstacleGrid.length][obstacleGrid[0].length];
        for (i = 0; i < obstacleGrid.length; i++) {
            for (j = 0; j < obstacleGrid[0].length; j++) {
                if (i == 0 && j == 0) {
                    matrix[i][j] = obstacleGrid[i][j] == 1 ? 0 : 1;
                } else if (i == 0) {
                    matrix[i][j] = obstacleGrid[i][j] == 1 ? 0 : matrix[i][j - 1];
                } else if (j == 0) {
                    matrix[i][j] = obstacleGrid[i][j] == 1 ? 0 : matrix[i - 1][j];
                } else {
                    matrix[i][j] = obstacleGrid[i][j] == 1 ? 0 : matrix[i - 1][j] + matrix[i][j - 1];
                }
            }

        }
        System.out.println(matrix[obstacleGrid.length - 1][obstacleGrid[0].length - 1]);
    }
}
