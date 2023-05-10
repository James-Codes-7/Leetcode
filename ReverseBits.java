package leetcode4;

import java.util.Arrays;
import java.util.HashMap;

public class ReverseBits {

    public static void main(String[] args) {
       ReverseBits reverseBits=new ReverseBits();
       reverseBits.reverseBits(2);
    }
    public int reverseBits(int n) {


        String val="";
        val+=n;
        int sum=0,i=1,j=0,size=val.length();
        while(j<size)
        {
            sum+=(val.charAt(j)-'0')*i;
            i*=2;
            j++;
            Arrays.binarySearch(new int[]{1,2,4,3,},0,2,4);
        }
        System.out.println(sum);

        return sum;
    }
}
