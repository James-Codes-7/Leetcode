package leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TrappingRainWater {

    private Scanner scanner = new Scanner(System.in);
    private int total = 0;

    public static void main(String[] args) {
        TrappingRainWater trappingRainWater = new TrappingRainWater();
        trappingRainWater.programLogic2();
    }

    private void programLogic() {
        System.out.println("Enter the size");
        int size = scanner.nextInt(), i = 0, j = 0;

        System.out.println("Enter the elements to the array");
        int[] array = new int[size];
        for (i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        int temp = 0, left = 0, right = 0, index = 0, add = -1, c = 1;
        for (i = 0; i < size; i++) {
            temp = array[i];
            if (i > add) {
                if (c == 1) {
                    add = 0;
                    c++;
                }
                left = left(array, i, add, temp, i);
                right = right(array, i, size, temp, i);
                add = -1;
//0 1 0 2 1 0 1 3 2 1 2 1;
                if (array[left] < array[right]) {
                    if (i != left) {
                        index = waterLiter(array, left, i, array[left]);
                        if (index != -1) add = index;
                    }
                    if (right != i) {
                        index = waterLiter(array, i + 1, right - 1, array[left]);
                        if (index != -1) add = index;
                    }
                } else if (array[left] > array[right]) {
                    if (i != left) {
                        index = waterLiter(array, left + 1, i, array[right]);
                        if (index != -1) add = index;
                    }
                    if (i != right) {
                        index = waterLiter(array, i + 1, right - 1, array[right]);
                        if (index != -1) add = index;
                    }
                } else if (array[left] == array[right]) {
                    if (i != left) {
                        index = waterLiter(array, left, i, array[right]);
                        if (index != -1) add = index;
                    }
                    if (i != right) {
                        index = waterLiter(array, i + 1, right - 1, array[right]);
                        if (index != -1) add = index;
                    }
                }
                if (add == -1) add = right;
            }
        }
        System.out.println(total);
    }

    private int waterLiter(int[] array, int start, int end, int value) {
        int i = 0, temp = 0;
        for (i = start; i <= end; i++) {
            if (value - array[i] < 0) {
                return i;
            }
            temp += value - array[i];
        }
        if (temp == 0) return start;
        total += temp;
        return -1;
    }

    private int left(int[] array, int i, int size, int temp, int pos) {
        if (i == size - 1) return pos;
        if (array[i] > temp) {
            temp = array[i];
            pos = i;
        }
        return left(array, i - 1, size, temp, pos);
    }

    private int right(int[] array, int i, int size, int temp, int pos) {
        if (i == size) return pos;
        if (array[i] > temp) {
            temp = array[i];
            pos = i;
        }
        return right(array, i + 1, size, temp, pos);
    }

    private void logic() {
        System.out.println("Enter the size");
        int size = scanner.nextInt(), i = 0, j = 0;

        System.out.println("Enter the elements to the array");
        int[] height = new int[size];
        for (i = 0; i < size; i++) {
            height[i] = scanner.nextInt();
        }
        int temp = 0, left = 0, right = 0, value = 0, total = 0;

        for (i = 1; i < size - 1; i++) {
            temp = height[i];
            left = left(height, i, 0, temp, i);
            right = right(height, i + 1, size, temp, i);
            if (height[left] <= height[right])
                value = height[left] - temp;
            else value = height[right] - temp;
            if (value > 0) total += value;
        }
        System.out.println(total);
    }

    private void programLogic2() {
        System.out.println("Enter the size");
        int size = scanner.nextInt(), i = 0, j = 0;

        System.out.println("Enter the elements to the array");
        int[] height = new int[size];
        for (i = 0; i < size; i++) {
            height[i] = scanner.nextInt();
        }
        int temp = 0, left = 0, right = 0, value = 0, total = 0, pos = 0;
         size=height.length;
        for (i = 1; i < size - 1; i++) {
            temp = height[i];
            pos=i;
            for (j = i - 1; j >= 0; j--) {
                if (temp < height[j]) {
                    temp = height[j];
                    pos = j;
                }
            }
            left = pos;
            pos = 0;
            temp = height[i];
            for (j = i + 1; j < size; j++) {
                if (temp < height[j]) {
                    temp = height[j];
                    pos = j;
                }
            }
            if (pos != 0)
                right = pos;
            else right = i;
            System.out.println(height[left] + "   " + height[right]);
            if (height[left] <= height[right])
                value = height[left] - height[i];
            else value = height[right] - height[i];
            if (value > 0) total += value;
        }
        System.out.println(total);
    }
}
