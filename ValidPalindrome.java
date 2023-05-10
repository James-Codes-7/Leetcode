package leetcode3;

import java.util.Locale;

public class ValidPalindrome {

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        validPalindrome.programLogic();
    }

    private void programLogic() {
        String s = "A man, a plan, a canal: Panama";

        String add = "";
        int i = 0, j = 0, size = s.length();
        s = s.toLowerCase();
        for (i = 0; i < size; i++)
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                add += s.charAt(i);
            }
        size = add.length();
        for (i = 0; i < size; i++) {
            if (add.charAt(i) != add.charAt(size - 1 - i)) {
            }
        }


    }
}
