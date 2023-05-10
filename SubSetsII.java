package leetcode3;

import java.util.*;

public class SubSetsII {

    public static void main(String[] args) {
        SubSetsII subSetsII = new SubSetsII();
        subSetsII.programLogic();
    }

    Set<List<Integer>> set = new HashSet<>();
    List<Integer> list;

    private void programLogic() {
        int[] nums = {1, 2, 2};
        int i = 0, j = 0;
        for (i = 0; i <= nums.length; i++) {
          permutation(nums,0, i,new ArrayList<>());
        }
        System.out.println(set);
    }

    private void permutation(int[] array, int i, int size, List<Integer> arrayList) {
        if (i == size) {
            list = new ArrayList<>(arrayList);
            Collections.sort(list);
            set.add(list);
        } else {
            for (int j = i; j < array.length; j++) {
                arrayList.add(array[j]);
                permutation(array, j+1, size, arrayList);
                arrayList.remove((Integer) array[j]);
            }
        }
    }
}
