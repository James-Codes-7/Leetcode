package leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class NextPermutation {

    private Scanner scanner = new Scanner(System.in);
     int count=1;
    public static void main(String[] args) {

        NextPermutation nextPermutation = new NextPermutation();
        nextPermutation.programlogic();
    }

    private void programlogic() {
        System.out.println("Enter the array size");
        int size = scanner.nextInt();

        int array[] = new int[size], i = 0, j = 0;

        System.out.println("Enter the elements to the array");
        for (i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        i=0;
        permutation(array, i, size - 1);
    }
    public void permutation(int[] array, int i, int size) {
        if (i == size + 1) {
            System.out.println(Arrays.toString(array));
        } else {
            for (int j = i; j <= size; j++) {
                swap(array,i,j);
                permutation(array,i+1,size);
                swap(array,i,j);
            }
        }
    }
    public void swap(int[] array,int i,int j)
    {
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }
}
