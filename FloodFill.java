package leetcode2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

    public static void main(String[] args) {
        FloodFill floodFill = new FloodFill();
        floodFill.programLogic();
    }

    private void programLogic() {
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int sr = 1, sc = 1, color = 2, i = 0, row = 0, column = 0, val1, val2 = 0, permanent = 0;
        Queue<Integer> queue = new LinkedList<>();
        int[][] moment = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        queue.add(sr);
        queue.add(sc);
        permanent = image[sr][sc];
        while (!queue.isEmpty()) {
            val1 = queue.poll();
            val2 = queue.poll();
            for (i = 0; i < moment.length; i++) {
                row = moment[i][0] + val1;
                column = moment[i][1] + val2;
                if (row >= 0 && column >= 0 && row < image.length && column < image[0].length) {
                    if (image[row][column] == permanent) {
                        image[row][column] = color;
                        queue.add(row);
                        queue.add(column);
                    }
                }
            }
        }
        System.out.println(Arrays.deepToString(image));
    }
}
