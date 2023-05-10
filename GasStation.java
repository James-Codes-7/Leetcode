package leetcode3;

public class GasStation {

    public static void main(String[] args) {

        GasStation gasStation = new GasStation();
        //gasStation.programLogic();
        gasStation.logic2();
    }

    private void programLogic() {
        int[] gas = {4, 5, 3, 1, 4}, cost = {5, 4, 3, 4, 2};
        int i = 0, j = 0, c = 1, temp = 0, count = 0, r = 0;
        for (i = 1; i < gas.length; i++) {
            if (c == 1) {
                temp = gas[j];
                c++;
                count = j;
            }
            temp = i == 0 ? temp - cost[gas.length - 1] : temp - cost[i - 1];
            if (temp <= 0 && r < gas.length - 1) {
                j++;
                i = j == gas.length - 1 ? -1 : j;
                c = 1;
                r = 0;
                continue;
            }
            temp += gas[i];
            System.out.println(count + " " + temp);
            if (temp > 0 && r == gas.length - 1) {
                System.out.println(count);
                return;
            }
            r++;
            if (j == gas.length - 1 && i == gas.length - 1) break;
            if (i == gas.length - 1)
                i = -1;
        }
    }

    private void logic2() {
        int[] gas = {1,2,3,4,5}, cost = {3,4,5,1,2};
        int i = 0, j = 0, c = 1, temp = gas[0], count = 0, r = 0, pos = 0;
        for (i = 0; i < gas.length; i++) {
            if (c == 1) {
                temp=gas[j];
                pos = j;
                c++;
            }
            temp -=cost[i];
            if (temp < 0) {
                j++;
                i = i==gas.length-1?0:j;
                c = 1;
                continue;
            }
            temp=i==gas.length-1?temp+gas[0]:temp+gas[i+1];
            r++;
            if(r==gas.length-1&&temp>0)
                System.out.println( pos);
            if(j==gas.length-1&&i==gas.length-1)break;
            if(i==gas.length-1)i=-1;
        }
    }
}
