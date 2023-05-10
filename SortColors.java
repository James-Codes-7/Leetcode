package leetcode2;

import java.util.Scanner;

public class SortColors {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SortColors sortColors = new SortColors();
        sortColors.programLogic();
    }
    private void programLogic() {
        System.out.println("Enter the arraysize");
        int size = scanner.nextInt(), i = 0, j = 0;

        int[] nums = new int[size];

        System.out.println("enter the elements to the metrix");
        for (i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        int k=0;
        int[][] values = new int[3][2];
        for (i = 0; i < size; i++) {
            values[nums[i]][1]++;
        }
        for (i = 0; i <= 2; i++) {
            for (j = 0; j < values[i][1]; j++) {
                nums[k++]=i;
            }
        }
    }
}
