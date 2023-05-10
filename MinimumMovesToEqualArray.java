package leetcode2;

public class MinimumMovesToEqualArray {

    public static void main(String[] args) {
        MinimumMovesToEqualArray minimumMovesToEqualArray = new MinimumMovesToEqualArray();
        minimumMovesToEqualArray.programLogic();
    }

    private void programLogic() {
        int[] nums = {1, 2,3};

        int i = 0, sum = 0, size = nums.length, common = 0, total = 0;
        for (i = 0; i < size; i++) {
            sum += nums[i];
        }
        common = sum / size;
        for (i = 0; i < size; i++) {
            total += nums[i] < common ? common - nums[i] : nums[i] - common;
        }
        System.out.println(total);

    }
}
