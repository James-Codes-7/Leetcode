package leetcode2;

import java.util.*;

public class SubSets {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        SubSets subSets = new SubSets();
        subSets.programLogic();
    }

    Set<List<Integer>> set = new HashSet<>();

    private void programLogic() {
        System.out.println("Enter the array Size");
        int size = scanner.nextInt(), i = 0, j = 0;
        int[] nums = new int[size];
        System.out.println("Enter the elements to the array");
        for (i = 0; i < size; i++) {
            nums[i] = scanner.nextInt();
        }
        for (i = 1; i <= size; i++) {
            uniquePath(nums, 0, i, 0, new ArrayList<>());
        }
        System.out.println(set);
    }

    ArrayList<Integer> integers = null;

    private void uniquePath(int[] array, int i, int size, int v, ArrayList<Integer> subArrayList) {
        if (i == size) {
            integers = new ArrayList<>(subArrayList);
            Collections.sort(integers);
            set.add(integers);
        } else {
            for (int j = v; j < array.length; j++) {
                subArrayList.add(array[j]);
                uniquePath(array, i + 1, size, j + 1, subArrayList);
                subArrayList.remove((Integer) array[j]);
            }
        }
    }
}
