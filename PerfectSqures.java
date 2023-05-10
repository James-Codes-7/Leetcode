package leetcode4;

import java.util.ArrayList;
import java.util.List;

public class PerfectSqures {

    int minCount;

    public int numSquares(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        List<Integer> squares = new ArrayList<>();
        squares.add(1);
        int x = 1;
        int inc = 3;
        //add possible squares that could make up the current number
        while ((x + inc) <= n) {
            if ((x + inc) == n) return 1;
            squares.add(0, x + inc);
            x = x + inc;
            inc += 2;
        }
        backtrack(n, squares, 0);
        return minCount;
    }

    public void backtrack(int remain, List<Integer> squares, int count) {
        if (remain == 0) {
            if (count < minCount) {
                minCount = count;
            }
            return;
        } else if (remain < 0) return;
        for (int i = 0; i < squares.size(); i++) {
            if ((count + 1) >= minCount)
                break; //avoid looking for perfect square combinations whose length exceed our current min
            backtrack(remain - squares.get(i), squares, count + 1);
        }
    }

    public int numSquaress(int n) {
        int[] dp = new int[n + 1]; //dp[i] means ans for i
        //Update
        for (int i = 1; i <= n; i++) {
            int temp = dp[i - 1];
            for (int j = (int) Math.sqrt(i); j > 0; j--) {
                temp = Math.min(temp, dp[i - j * j]);
            }
            dp[i] = temp + 1;
        }
        return dp[n];

    }

    public int[] intersection(int[] nums1, int[] nums2) {

        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0, firstArrayMaximum = Integer.MIN_VALUE, secondArrayMaximum = Integer.MIN_VALUE, size = 0;
        while (i < nums1.length || i < nums2.length) {
            if (i < nums1.length) {
                if (firstArrayMaximum < nums1[i]) firstArrayMaximum = nums1[i];
            }
            if (i < nums2.length) {
                if (secondArrayMaximum < nums2[i]) secondArrayMaximum = nums2[i];
            }
            i++;
        }
        firstArrayMaximum = firstArrayMaximum < secondArrayMaximum ? firstArrayMaximum : secondArrayMaximum;
        firstArrayMaximum++;

        int compareArray1[] = new int[firstArrayMaximum], compareArray2[] = new int[firstArrayMaximum];
        for (i = 0; i < nums1.length || i < nums2.length; i++) {
            if (i < nums1.length && nums1[i] < firstArrayMaximum) {
                compareArray1[nums1[i]]++;
            }
            if (i < nums2.length && nums2[i] < firstArrayMaximum) {
                compareArray2[nums2[i]]++;
            }
        }
        for (i = 0; i < firstArrayMaximum; i++) {
            if (compareArray1[i] >= 1 && compareArray2[i] >= 1) {
                list.add(i);
            }
        }
        compareArray1 = new int[size = list.size()];
        for (i = 0; i < size; i++) {
            compareArray1[i] = list.get(i);
        }
        return compareArray1;
    }
}
