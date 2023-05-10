package leetcode4;

public class LongestIncreasingSubseaquences {

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] dp = new int[nums.length + 1];
        int index = 0;
        dp[0] = nums[0];

        for (int num : nums) {
            if (num > dp[index]) {
                dp[++index] = num;
            } else {
                int j = index;
                while (j >= 0 && dp[j] >= num) {
                    j--;
                }
                dp[j + 1] = num;
            }
        }
        return index + 1;
    }
}
