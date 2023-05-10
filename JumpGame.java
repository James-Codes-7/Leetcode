package leetcode;

import java.util.Scanner;

public class JumpGame {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        JumpGame jumpGame = new JumpGame();
        jumpGame.programLogic();
    }

    private void programLogic() {
        System.out.println("Enter the array Size");
        int size = scanner.nextInt(), i = 0, sum = 0, k = 0;

        System.out.println("Enter the elements to the array");
        int[] nums = new int[size];
        for (i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        size=nums.length;
        for (i = 0; i < size; i++) {
            sum = i+1;
            while (sum < size) {
                k=nums[sum];
                sum+= nums[sum];
                if(nums[sum]<=0)return;
                if (sum == size - 1) {
                    System.out.println(k);
                    return;
                }
            }
        }
    }
}
