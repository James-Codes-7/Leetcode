package leetcode;

public class SearchRotatedArray {

    public static void main(String[] args) {
        SearchRotatedArray searchRotatedArray = new SearchRotatedArray();
        searchRotatedArray.proramPage();
    }

    private void proramPage() {
        int nums[] = {4, 5, 6, 7, 0, 1, 2};
        int first = 0, last = nums.length - 1, mid = 0, target = 0;
        while (first < last) {
            mid = (first + last) / 2;
            if(nums[first]==target) {
                System.out.println(first);
            }
            if(nums[last]==target) System.out.println(last);
            if (nums[mid] == target) {
                System.out.println(mid);
            }
            if (nums[first] < nums[mid]) {
                if (target < nums[mid]&&target> nums[first])
                    last = mid - 1;
                else first = mid + 1;

            } else{
                if (target > nums[mid]&&target<nums[last]) {
                    first = mid + 1;
                } else last = mid - 1;
            }
        }

    }
}
//    int  first = 0, last = nums.length - 1, mid = 0;
//        if(last==0&&target==nums[0])return 0;
//                if(last==0)return -1;
//
//                while (first < last) {
//        mid = (first + last) / 2;
//        if(nums[first]==target)return first;
//        if(nums[last]==target)return last;
//        if (nums[mid] == target) {
//        return mid;
//        }
//        if ((target < nums[first] && nums[first] < nums[mid]) || (target > nums[first] && nums[first] > nums[mid])) {
//        first = mid;
//        }
//        else if((target > nums[first] && nums[first] < nums[mid]) || (target > nums[first] && nums[first] < nums[mid]))
//        first=mid;
//
//        else last = mid;
//        }
//        return -1;
//        }
