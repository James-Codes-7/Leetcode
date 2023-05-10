package leetcode2;

import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Combinations {

    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Combinations combinations = new Combinations();
        combinations.programLogic();
    }

    ArrayList<List<Integer>> arrayList = new ArrayList<>();
    ArrayList<Integer> integerArrayList = null;

    private void programLogic() {
        System.out.println("Enter the Number");
        int number = scanner.nextInt();

        System.out.println("Enter the Key");
        int key = scanner.nextInt();
        int i = 0, j = 0;
        int[] array = new int[number];
        for (i = 1; i <= number; i++) {
            array[i - 1] = i;
        }
        getList(array,0,key,new ArrayList<>(),0);
        System.out.println(arrayList);
    }

    private void getList(int[] array, int i, int k, ArrayList<Integer> subArrayList,int v) {
        if (i == k) {
            arrayList.add(new ArrayList<>(subArrayList));
        } else {
            for (int j = v; j < array.length; j++) {
                subArrayList.add(array[j]);
                getList(array, i + 1, k, subArrayList,j+1);
                subArrayList.remove((Integer) array[j]);
            }
        }
    }
}
