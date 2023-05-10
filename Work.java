package leetcode;

import java.util.Arrays;

public class Work {

    public static void main(String[] args) {
        Work work = new Work();
        int aee[]={5,7,7,8,8,10};
     int a[]=work.searchRange(aee,8);
        System.out.println(a[0]+" "+a[1]);
    }public int[] searchRange(int[] nums, int target) {
        int l = binarySearch(nums, target);
        if (l == nums.length || nums[l] != target) return new int[] { -1, -1 };
        int r = binarySearch(nums, target + 1);
        return new int[] { l, r - 1 };
    }
    private int binarySearch(int[] nums, int target) {
        int l = 0, r = nums.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (nums[m] < target) l = m + 1;
            else r = m ;
        }
        return l;
    }

}
