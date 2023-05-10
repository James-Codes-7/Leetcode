package leetcode2;

import java.util.*;

public class PermutationII {

    private Set<List<Integer>> set = new HashSet<List<Integer>>();

    public static void main(String[] args) {
        PermutationII permutationII = new PermutationII();
        permutationII.programLogic();
    }

    private void programLogic() {
        int[] array = {1, 1, 2};
        permutation(array, 0, array.length);
        System.out.println(set);
    }
    private void permutation(int[] array, int i, int size) {
        if (i == size) {
            List<Integer> list=Arrays.stream(array).boxed().toList();
            set.add(new ArrayList<>(list));
        } else {
            for (int j = i; j < size; j++) {
                    swap(array,i,j);
                    permutation(array, i + 1, size);
                    swap(array,i,j);
            }
        }
    }

    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
