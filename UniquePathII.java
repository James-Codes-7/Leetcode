package leetcode2;

import java.util.Scanner;

public class UniquePathII {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        UniquePathII uniquePathII = new UniquePathII();
        uniquePathII.programLogic();
    }

    private void programLogic() {
        System.out.println("Enter the row Size");
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
        int[][] check = new int[row][column];
        int sum = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (i == 0) {
                    if (matrix[0][j] != 1)
                        check[0][j] = 1;
                    else check[0][j] = 0;
                }
               else if (matrix[i][j] != 1) {
                    sum += check[i - 1][j];
                    check[i][j] = sum;
                } else {
                    check[i][j] = 0;
                    sum = 0;
                }
            }
            sum=0;
        }
        System.out.println(check[row-1][column-1]);
    }
}
