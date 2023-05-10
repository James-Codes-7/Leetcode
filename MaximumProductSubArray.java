package leetcode3;

public class MaximumProductSubArray {

    public static void main(String[] args) {
      MaximumProductSubArray maximumProductSubArray=new MaximumProductSubArray();
      maximumProductSubArray.programLogic();
    }

    private void programLogic() {
        int[] nums = {2, 3, -2, 4};
        int i = 0, j = 0, k = 0, val = 1, max = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] * val > 0) {
                val = val * nums[i];
                if (val > max) max = val;
            } else {
                val = nums[i];
            }
        }
        System.out.println(max);


    }
}
