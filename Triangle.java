package leetcode3;

import java.util.ArrayList;
import java.util.List;

public class Triangle {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        triangle.programLogic();
    }

    private void programLogic() {
        int[][] triangle = {{2}, {3, 4}, {6, 5, 7}, {4, 1, 8, 3}};
        int i = 0, j = 0, length = triangle.length;
        if (length == 1) {
            System.out.println(triangle[0][0]);
        }


        for (i = length - 2; i >= 0; i--) {
            for (j = 0; j < triangle[i].length; j++) {

                triangle[i][j] += Math.min(triangle[i + 1][j], triangle[i + 1][j + 1]);
            }
        }
        System.out.println(triangle[0][0]);

    }
}
