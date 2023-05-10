package leetcode3;

import java.util.*;

public class CombinationSumII {

    public static void main(String[] args) {
        CombinationSumII combinationSumII = new CombinationSumII();
        combinationSumII.programLogic();
    }

    ArrayList<Integer> arrayList1 = null;
    Set<List<Integer>> set = new HashSet<List<Integer>>();

    private void programLogic() {

        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        permutation(candidates, 0, 0, target, new ArrayList<>());
        System.out.println(set);
    }

    private void permutation(int[] array, int check, int total, int target, ArrayList<Integer> arrayList) {
        if (target == total) {
            arrayList1 = new ArrayList<>(arrayList);
            Collections.sort(arrayList1);
            set.add(new ArrayList<>(arrayList1));
        } else {
            for (int j = check; j < array.length; j++) {
                total += array[j];
                if (total > target) {
                    total -= array[j];
                    check++;
                    continue;
                }
                arrayList.add(array[j]);
                permutation(array, check + 1, total, target, arrayList);
                check++;
                total -= array[j];
                arrayList.remove((Integer) array[j]);
            }
        }
    }
}
