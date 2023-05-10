package leetcode;

import java.util.*;

public class CominationSum {

    public static void main(String[] args) {
        CominationSum cominationSum = new CominationSum();
        System.out.println(cominationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));
    }

    Set<List<Integer>> listSet = new LinkedHashSet<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        int size = candidates.length;
        //permutation(candidates, 0,new ArrayList<>(), target, size);
        sum(candidates, target);
        return new ArrayList<List<Integer>>(listSet);
    }

    private void sum(int[] candidate, int target) {
        Queue<Node> queue = new LinkedList<>();
        List<Integer> list, output;
        Node node;
        for (int val : candidate) {
            list = new ArrayList<>();
            list.add(val);
            if (val == target) listSet.add(list);
            else queue.add(new Node(list, val));
        }

        while (!queue.isEmpty()) {
            node = queue.poll();
            list = node.list;
            for (int val : candidate) {
                if (node.sum + val <= target) {
                    list.add(val);
                    if (node.sum + val == target) {
                        output = new ArrayList<>(list);
                        Collections.sort(output);
                        listSet.add(output);
                    } else {
                        queue.add(new Node(new ArrayList<>(list), node.sum + val));
                    }
                    list.remove(list.size() - 1);
                }
            }
        }
    }
}

class Node {
    List<Integer> list;
    int sum;

    public Node(List<Integer> list, int sum) {
        this.list = list;
        this.sum = sum;
    }
}
