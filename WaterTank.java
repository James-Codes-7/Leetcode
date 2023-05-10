package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class WaterTank {

    public static void main(String[] args) {

        WaterTank waterTank = new WaterTank();
        waterTank.programPage();
    }

    private void programPage() {
        int arr[]={1,2,3};
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,1));
        int size = arrayList.size(), first = 0, last = 0, temp, max = 0, mul = 0,j=size,i=0;
        while (i<size)
        {
            if(i>j)break;
            if (first < last) {
                first = arrayList.get(i++);
            }
            else if (first > last) {
                last = arrayList.get(--j);
            }
            else {
                first = arrayList.get(i++);
                last = arrayList.get(--j);
            }
            temp = Math.min(first, last);
            mul = j - i+1;
            temp *= mul;
            if (temp > max) {
                max = temp;
            }

        }
        System.out.println(max);
    }
}
