package leetcode3;

public class ReverseWordsInString {

    public static void main(String[] args) {
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();
        reverseWordsInString.programLogic();
    }

    private void programLogic() {
        String s = "  hello world  ";
        String additional = "", sub = "";
        int i = 0, j = 0, size = s.length();
        char[] arr = s.toCharArray();
        for (i = 0; i < size; i++) {
            if (arr[i] != ' ') {
                additional += arr[i];
            } else  {
                if (additional.length() != 0) {
                    sub = additional +" "+ sub;
                    additional = "";
                }
            }
        }
        System.out.println(additional+" "+sub);
    }
}
