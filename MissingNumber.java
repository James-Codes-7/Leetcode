package leetcode4;

public class MissingNumber {

    public static void main(String[] args) {
        MissingNumber missingNumber = new MissingNumber();
        missingNumber.programLogic();
    }

    private void programLogic() {
        int[] nums = {0,1};
        int i = 0, j = 0;
        int[] array[] = new int[nums.length + 1][1];
        for (i = 0; i < nums.length; i++) {
            array[nums[i]][0] = 1;
        }
        for (i = 0; i < array.length; i++) {
            if (array[i][0] != 1) {
                System.out.println(i);
            }
        }
    }
}
