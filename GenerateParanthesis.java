package leetcode;

import java.util.LinkedList;
import java.util.List;

public class GenerateParanthesis {

    public static void main(String arr[]) {
        GenerateParanthesis generateParenthesis = new GenerateParanthesis();
        System.out.println(generateParenthesis.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<String>();
        process("", n, n, result);
        return result;
    }

    public void process(String prefix, int left, int right, List<String> result) {
        if (left == 0 && right == 0) {
            result.add(prefix);
            System.out.println(prefix);
            return;
        }
        if (left > 0) {
            System.out.println(prefix);
            process(prefix + '(', left - 1, right, result);
        }
        if (left < right) {
            System.out.println(prefix);
            process(prefix + ')', left, right - 1, result);
        }
    }
}