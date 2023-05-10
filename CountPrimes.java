package leetcode3;

public class CountPrimes {

    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        countPrimes.programLogic();
    }

    private void programLogic() {
        int n = 10, i = 0, j = 0, sqrtvalue = 0, c = 0, count = 0;
        for (i = 2; i <= n; i++) {
            sqrtvalue = (int) Math.sqrt(i);
            if (sqrtvalue == 1) count++;
            else {
                j = 2;
                c = 0;
                while (j <= sqrtvalue) {
                    if (i % j == 0) {
                        c = 1;
                        break;
                    }
                    j++;
                }
                if (c == 0) count++;
            }
        }
        System.out.println(count);

    }
}
