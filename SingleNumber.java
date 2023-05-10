package leetcode2;

public class SingleNumber {

    public static void main(String[] args) {
       SingleNumber singleNumber=new SingleNumber();
       singleNumber.progralogic();
    }

    private void progralogic() {
        int[] array = {4,1,2,1,2};
        int i = 0, xor = 0;
        for (i = 0; i < array.length; i++) {
            xor ^= array[i];
        }
        System.out.println(xor);
    }
}
