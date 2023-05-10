package leetcode2;

import java.util.Scanner;

public class WordSearch {

    private Scanner scanner = new Scanner(System.in);
    private boolean isValid = false;

    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        wordSearch.programLogic();
    }

    int[][] moment = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}};

    private void programLogic() {
        System.out.println("Enter the row");
        int row = scanner.nextInt();

        System.out.println("Enter the column");
        int column = scanner.nextInt(), i = 0, j = 0;

        System.out.println("Enter the Character MAtrix");
        char[][] matrix = new char[row][column];
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                matrix[i][j] = scanner.next().charAt(0);
            }
        }
        System.out.println("Enter the Word");
        String str = scanner.next();
        label:
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (matrix[i][j] == str.charAt(0)) {
                    getWord(matrix, i, j, str, 1);
                    if (isValid) {
                        System.out.println(true);
                        break label;
                    }
                }
            }
        }
    }

    private void getWord(char[][] matrix, int i, int j, String word, int count) {
        int row = 0, col = 0;
        if (count == word.length()) {
            isValid = true;
        } else {
            for (int k = 0; k < moment.length; k++) {
                row = i + moment[k][0];
                col = j + moment[k][1];
                if (row >= 0 && col >= 0 && row < matrix.length && col < matrix[0].length) {
                    if (matrix[row][col] == word.charAt(count)) {
                        count += 1;
                        getWord(matrix, row, col, word, count);
                        count -= 1;
                    }
                }
            }
        }
    }
}
