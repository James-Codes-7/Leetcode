package leetcode3;

public class BestTimeToShellStock {

    public static void main(String[] args) {

        BestTimeToShellStock bestTimeToShellStock = new BestTimeToShellStock();
        //bestTimeToShellStock.programLogic();
        bestTimeToShellStock.proramLogic2();
    }

    private void programLogic() {
        int[] prices = {2, 11, 1, 4, 7};
        int i = 0, j = 0, size = prices.length, min = 0, max = 0, firstmin = 0, firstmax = 0, diff = 0;
        max = size - 1;
        min = 0;
        for (i = 0; i < size; i++) {

            if (prices[size - 1 - i] > prices[max] && size - 1 - i > min)
                max = size - 1 - i;
            if (prices[i] < prices[min] && i < max)
                min = i;
            if (prices[i] < prices[firstmin]) firstmin = i;
            if (prices[i] > prices[firstmax]) firstmax = i;
            if (firstmin < firstmax && prices[firstmax] - prices[firstmin] > diff)
                diff = prices[firstmax] - prices[firstmin];
        }
//        if(diff>prices[max]-prices[min])return diff;
//        if(prices[min]<prices[max])return prices[max]-prices[min];
//        else return 0;
    }

    private void proramLogic2() {
        int[] prices = {2, 11, 1, 4, 7};
        int i = 0, size = prices.length, firstmin = prices[0], firstmax = 0;
        for (i = 0; i < size; i++) {
            firstmin = Math.min(firstmin, prices[i]);
            firstmax = Math.max(firstmax, prices[i] - firstmin);
        }
        System.out.println(firstmax);
    }
}
