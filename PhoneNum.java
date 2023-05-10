package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneNum {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        PhoneNum phoneNum = new PhoneNum();
        phoneNum.programPage();
    }

    List<String> stringList = new ArrayList<>();

    private void programPage() {
        System.out.println("Enter the digits");
        String digits = scanner.next();

        String arr[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        String[] val = new String[digits.length()];
        int size = digits.length(), i = 0;
        for (i = 0; i < size; i++) {
            val[i] = arr[Integer.parseInt(digits.charAt(i) + "")];
        }
        permutation(val, 0, digits.length(), "");
        System.out.println(stringList);
    }
    public void permutation(String[] arr, int k, int size, String data) {
        if (k == size) {
            stringList.add(data);
        } else {
            int length = arr[k].length();
            for (int j = 0; j < length; j++) {
                data += arr[k].charAt(j);
                permutation(arr, k + 1, size, data);
                data = data.substring(0, data.length() - 1);
            }
        }
    }
}
