package leetcode4;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        moveZeros.programLogic();
    }

    private void programLogic() {
        int[] nums = {0, 1, 0, 3, 12};
        int i = 0, j = 0, temp = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                j = nextElement(nums, i);
                if(j<nums.length) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }else return;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
    private int nextElement(int[] array, int i) {
        while (i<array.length&&array[i] == 0) {
            i++;
        }
        return i;
    }
}
