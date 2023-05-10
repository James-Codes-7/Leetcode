package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PhoneNumber {

    public static void main(String[] args) {

        PhoneNumber phoneNumber = new PhoneNumber();
        System.out.println(phoneNumber.letterCombinations("234"));
    }
    public String toString(int[] num, String word) {
        String res = "";
        String ar[] = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < num.length; i++) {
            int index = word.charAt(i) - '2';
            res += ar[index].charAt(num[i]);
        }
        return res;
    }
    public int[] InterChange(int[] num, String word) {
        for (int i = num.length - 1; i >= 0; i--) {
            if (num[i] == -1) {
                if (word.charAt(i) == '7' || word.charAt(i) == '9')
                    num[i] = 3;
                else num[i] = 2;
                if (i > 0) num[i - 1]--;
            }
        }
        return num;
    }

    public List<String> letterCombinations(String digits) {
        List<String> words = new ArrayList();
        if (digits.length() == 0) return words;
        int numbers[] = new int[digits.length()];
        int iteration = 1;
        for (int i = 0; i < digits.length(); i++) {
            if (digits.charAt(i) == '7' || digits.charAt(i) == '9') {
                numbers[i] = 3;
                iteration *= 4;
            } else {
                numbers[i] = 2;
                iteration *= 3;
            }
        }
        int count = 0;
        for (int i = 0; i < iteration; i++) {
            words.add(toString(numbers, digits));
            if (numbers[numbers.length - 1]-- == 0)
                numbers = InterChange(numbers, digits);
            count++;
        }
        return words;
    }
}
