package leetcode2;

import java.util.Scanner;

public class Search2DMatrix {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

    }

    private void programLogic() {
        System.out.println("Enter the row");
        int row = scanner.nextInt();

        System.out.println("Enter the column size");
        int column = scanner.nextInt(), i = 0, j = 0;

        int[][] matrix = new int[row][column];
        System.out.println("Enter the elements to the matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter the numer");
        int target = scanner.nextInt(), pos = -1, size = 0,mid=0;

        for (i = 0; i < row; i++) {
            if (matrix[i][0] > target) {
                pos = i;
                break;
            }
        }
        if (pos != -1) {
            size = matrix[pos].length;
            if (matrix[pos][0] == target || matrix[pos][size - 1] == target) {
            } else {
                i = 0;
                j = size - 1;
                while (i < j) {
                    mid = (i + j) / 2;
                    if (matrix[pos][mid] == target) {
                    }
                    if (matrix[pos][mid] > target)
                        i = mid + 1;
                    else j = mid - 1;
                }
            }
        }
    }
}
