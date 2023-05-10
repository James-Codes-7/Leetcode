package leetcode5;

import java.util.ArrayList;
import java.util.List;

public class LexographicalNumbers {
    public static void main(String[] args) {
        LexographicalNumbers lexographicalNumbers=new LexographicalNumbers();
        lexographicalNumbers.programLogic();
    }
    private void programLogic()
    {
        int n=11000;
        List<Integer> list = new ArrayList<>();
             int curr = 1;
             for (int i = 1; i <= n; i++) {
                 list.add(curr);
                 if (curr * 10 <= n) {
                     curr *= 10;
                 } else if (curr % 10 != 9 && curr + 1 <= n) {
                     curr++;
                 } else {
                     while ((curr / 10) % 10 == 9) {
                         curr /= 10;
                     }
                     curr = curr / 10 + 1;
                 }
             }
        System.out.println(list);
    }
}
