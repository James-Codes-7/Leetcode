package leetcode;

import java.util.Arrays;

public class SearchRotatedSortedArray {

    public static void main(String[] args) {

        SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();
        System.out.println(searchRotatedSortedArray.programPage());
    }

    private int programPage() {
        int nums[] = {4,5,6,7,0,1,2};

        int first = 0, last = nums.length-1, mid = 0, target = 0;
        if (last == 0 && target == nums[last+1 - 1]) return last;
        if (last <= 0) return -1;
        if (target == nums[first]) return first;
        if (target == nums[last]) return last;
        while (first < last) {
            mid = (first + last) / 2;
            if (target < nums[first] && target < nums[last]) {
                if (target < nums[mid]) {
                    first = mid;
                }
            } else if (target > nums[first] && target > nums[last]) {
                if (target > nums[mid])
                    last = mid;
            } else return -1;
            if (nums[mid] == target) return mid;
        }
        return -1;
    }
}

//    int first=0,last=nums.length-1,mid=(first+last+1)/2;
//
//        if(last==0&&target==nums[last])return last;
//                if(last==0)return -1;
//                if(target==nums[first])return first;
//                if(target==nums[last])return last;
//                if(target>nums[first])
//                {
//                if(target<nums[mid])
//        {
//        last=mid;
//        }
//        else if(target==nums[mid])  return mid;
//        else if(mid+1<last&&target>=nums[mid+1])first=mid;
//        else first=mid;
//
//        }
//        else if(target<nums[last])
//        {
//        if(target>nums[mid])
//        {
//        first=mid;
//        }
//        else if(target==nums[mid])  return mid;
//        else if(mid+1<last&&target==nums[mid+1])return mid+1;
//        else if(mid+1<last&&target>=nums[mid+1])first=mid;
//        else last=mid;
//        }
//        while (first<=last)
//        {
//        mid=(first+last)/2;
//        if(nums[mid]==target)return mid;
//        else if(target<nums[mid])last=mid-1;
//        else first=mid+1;
//        }
//
//        return -1;
//        }