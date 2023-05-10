package leetcode2;

import java.util.Scanner;

public class SetZeros {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SetZeros setZeros = new SetZeros();
        setZeros.programLogic();
    }

    private void programLogic() {

        System.out.println("Enter the Row Size");
        int row = scanner.nextInt();

        System.out.println("Enter the Column Size");
        int column = scanner.nextInt();

        int[][] matrix = new int[row][column];
        int i = 0, j = 0;
        System.out.println("Enter the elements to the Matrix");
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int[] rowcheck = new int[row], columnCheck = new int[column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (matrix[i][j] == 0) {
                    rowcheck[i] = 1;
                    columnCheck[j] = 1;
                }
            }
        }
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (rowcheck[i] == 1 || columnCheck[j] == 1)
                    matrix[i][j] = 0;
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

    }
}
