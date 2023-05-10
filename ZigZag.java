package leetcode;

import java.util.Scanner;

public class ZigZag {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        ZigZag zigZag = new ZigZag();
        zigZag.programPage();
    }

    private void programPage() {
        System.out.println("Enter the String");
        String s = scanner.next(), sent = "";

        System.out.println("Enter the rows");
        int numRows = scanner.nextInt();

        int first = (numRows - 1) * 2, last = 0, i = 0, j = 0, size = s.length();

        for (i = 0; i < numRows; i++) {
            for (j = i; j < size; ) {
                sent += s.charAt(j);
                if (i == 0) {
                    j += first;
                } else if (i == numRows - 1) {
                    j += last;
                } else {
                    j += first;
                    if (j < size)
                       sent+=s.charAt(j);
                    j += last;
                }
            }
            first-=2;
            last+=2;
        }
        System.out.println(sent);
    }
}
