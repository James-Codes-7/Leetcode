package leetcode2;

import java.util.Arrays;

public class MergeSortedArray {

    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        mergeSortedArray.programLogic();
    }

    private void programLogic() {
        int[] nums1 = {1}, nums2 = {};
        int m = 1, n = 0, i = 0, j = 0, k = 0, size = nums1.length;
        for (i = 0; i < size && j < n; i++) {
            if (nums2[j] < nums1[i]) {
                for (k = m; k > i; k--)
                    nums1[k] = nums1[k - 1];
                nums1[i] = nums2[j];
                j++;
                m++;
            }
            if(nums2[j]>nums1[i]&&m<=i){
                nums1[m]=nums2[j];
                j++;
                m++;
            }
        }
        System.out.println(Arrays.toString(nums1));
    }
}
