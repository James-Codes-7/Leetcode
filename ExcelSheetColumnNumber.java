package leetcode4;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
      //  excelSheetColumnNumber.programLogic();
        excelSheetColumnNumber.programLogic2();
    }

    private void programLogic() {
        int n = 900;
        String word = "";
        while (n != 0) {
            if (n % 26 == 0) {
                word = "Z" + word;
                System.out.println(n);
                n /= 26;
                n =n==1?0:n-1;
            } else {
                word = ((char)(64 + n % 26)) + word;
                System.out.println(n);
                n /= 26;
            }

        }
        System.out.println(word);
    }
    private void programLogic2()
    {
       String s="ZXZ";
        int result = 0;
        for(int i = 0 ; i < s.length(); i++) {
            result = result * 26 + (s.charAt(i) - 'A' + 1);
        }
        System.out.println(result);
    }
}
