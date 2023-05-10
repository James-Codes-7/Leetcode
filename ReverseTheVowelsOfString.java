package leetcode4;

import java.util.Arrays;

public class ReverseTheVowelsOfString {

    public static void main(String[] args) {
        ReverseTheVowelsOfString reverseTheVowelsOfString = new ReverseTheVowelsOfString();
        reverseTheVowelsOfString.programLogic();
    }

    private void programLogic() {
        String word = "hello";
        char[] array = word.toCharArray();
        int i = 0, j = array.length - 1;
        boolean isTrueOne = true, isTrueTwo = true;
        while (i < j) {
            if (isTrueOne && vowelCheck(array[i])) {
                isTrueOne = false;
            }
            if (isTrueTwo && vowelCheck(array[j])) {
                isTrueTwo = false;
            }
            if (!isTrueTwo && !isTrueOne) {
                swap(array, i, j);
                isTrueOne = true;
                isTrueTwo = true;
            }
            if (isTrueOne) i++;
            if (isTrueTwo) j--;
        }
        System.out.println(Arrays.toString(array));
    }
    private void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private boolean vowelCheck(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'o' || ch == 'i' || ch == 'u';
    }
}
