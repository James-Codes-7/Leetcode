package leetcode;

public class FoundFirstAndLastPositionOfElement {
    int nums[] = {1, 1, 2, 2, 3, 3, 8, 8, 9, 10, 10};

    public static void main(String[] args) {
        FoundFirstAndLastPositionOfElement foundFirstAndLastPositionOfElement = new FoundFirstAndLastPositionOfElement();
        foundFirstAndLastPositionOfElement.programPage();

    }

    public void programPage() {
        int first = 0, last = nums.length;
        int pos = permutations(first, last, 8, 0);
        if (nums[pos] != 8) return;
        System.out.println(pos);
        int po = permutations(first, last, 9, 0);
        System.out.println(po);
    }
    public int permutations(int first, int last, int target, int mid) {
        while (first < last) {
            mid = (first + last) / 2;
            if (target > nums[mid]) first = mid + 1;
            else last = mid;
        }
        return first;
    }
}
