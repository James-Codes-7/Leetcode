package leetcode3;

public class HouseRobber {

    public static void main(String[] args) {
        HouseRobber houseRobber = new HouseRobber();
        houseRobber.programLogic();
    }

    private void programLogic() {
        int nums[] = {1, 2, 3, 1};
        int one = nums[0], two = nums[1], posOne = 0, posTwo = 1, secOne = nums[0], second = nums[1], i = 0, sPos = 0, sPostwo = 1;
        for (i = 2; i < nums.length; i++) {

            if (posOne + 1 != i) {
                if (nums[i] < nums[i + 1]) {
                    one += nums[i + 1];
                    posOne = i + 1;
                    secOne += nums[i];
                    sPos = i;
                } else if(nums[i] > nums[i + 1]){
                    one += nums[i];
                    posOne = i;

                    secOne += nums[i + 1];
                    sPos = i + 1;
                }
                else {
                    one += nums[i];
                    posOne = i;
                }
            }
            if (posTwo + 1 != i) {
                if (nums[i] < nums[i + 1]) {
                    two += nums[i + 1];
                    posTwo = i + 1;
                    second += nums[i];
                    sPostwo = i;
                } else if(nums[i] > nums[i + 1]){
                    two += nums[i];
                    posTwo = i;
                    second += nums[i + 1];
                    sPostwo = i + 1;
                }
                else {
                    two += nums[i];
                    posTwo = i;
                }
            }

        }
    }
}
