package leetcode4;

public class FindMinimumRotatedSortedArray {

    public static void main(String[] args) {
        FindMinimumRotatedSortedArray findMinimumRotatedSortedArray = new FindMinimumRotatedSortedArray();
        findMinimumRotatedSortedArray.programLogic();
    }

    int value = 0;

    private void programLogic() {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int i = 0, j = 0;
        value = nums[0];
        get(nums, 0, nums.length - 1);
        System.out.println(value);
    }

    private void get(int[] array, int start, int end) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (array[mid] < value) value = array[mid];
            if (array[start] < value) value = array[start];
            if (array[end] < value) value = array[end];
            get(array, mid + 1, end);
            get(array,start,mid-1);
        }
    }
}
