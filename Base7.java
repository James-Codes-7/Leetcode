package leetcode2;

public class Base7 {

    public static void main(String[] args) {
        Base7 base7 = new Base7();
        base7.programLogic();
    }

    private void programLogic() {
        int num = -7;
        String str = "";
        while (num != 0) {
            str = (num % 7) + str;
            num /= 7;
        }
        System.out.println(str);
    }
}
