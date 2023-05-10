package leetcode4;

public class FactorialTrailingZeros {

    public static void main(String[] args) {
        FactorialTrailingZeros factorialTrailingZeros = new FactorialTrailingZeros();
        factorialTrailingZeros.programLogic();
    }

    int count = 0;

    private void programLogic() {
        int n = 5, result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            if (result % 10 == 0) count++;
        }
        System.out.println(count);
    }

}
