package leetcode3;

import java.util.Arrays;

public class SpiralMatrixII {

    public static void main(String[] args) {
       SpiralMatrixII spiralMatrixII=new SpiralMatrixII();
       spiralMatrixII.programLogic();
    }

    private void programLogic() {
        int n = 3;
        int i = 0, j = 0, x = 0, y = 0, s = 1;
        int[][] matrix = new int[n][n];
        for (i = 0; i <=n / 2; i++) {
            j = i;
            for (x = i, y = j; y < n - 1 - j; y++) {
                matrix[x][y] = s++;
            }
            for (x = i, y = n - 1 - j; x < n - 1 - i; x++) {
                matrix[x][y] = s++;
            }
            for (x = n - 1 - i, y = n - 1 - j; y >= j; y--) {
                matrix[x][y] = s++;
            }
            for (x = n - 2 - i, y = j; x > i; x--) {
                matrix[x][y] = s++;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
