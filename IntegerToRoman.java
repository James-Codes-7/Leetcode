package leetcode4;

public class IntegerToRoman {

    public static void main(String[] args) {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        integerToRoman.programLogic();
    }
    private void programLogic() {

        int num=400;
        String M[] = {"", "M", "MM", "MMM"};
        String C[] = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String X[] = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String I[] = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
        System.out.println(M[num/1000] + C[(num%1000)/100] + X[(num%100)/10] + I[num%10]);
    }

}
