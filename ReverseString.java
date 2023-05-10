package leetcode;
import java.math.BigInteger;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        String word = "";
        BigInteger bigInteger=new BigInteger("9877655433677889");
        System.out.println(bigInteger);
        for (int i = 0; i < T; i++) {
            word = scanner.next();
            int size = word.length();
            String tempString = "";
            for (int j = size - 1; j >= 0; j--) {
                tempString += "" + word.charAt(j);
            }
            int index = 0;
            for (int k = 0; k < size; k++) {
                if (tempString.charAt(index) == word.charAt(k)) {
                    index++;
                }
            }
            System.out.println(size - index);
        }
    }
}
