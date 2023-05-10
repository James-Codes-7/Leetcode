package leetcode4;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DecodeString {

    public static void main(String[] args) {
        DecodeString decodeString = new DecodeString();
        decodeString.programLogic();
    }


    Queue<Integer> queue =new LinkedList<>();

    private void programLogic() {
        String val = "3[a5[tb]]2[g2[e]]", val2 = "", output = "";
        int i = 0, j = 0, num = 0, size = val.length();

        for (i = 0; i < size; i++) {
            if (val.charAt(i) >= '0' && val.charAt(i) <= '9') {
                num = num * 10 + (val.charAt(i) - '0');
            } else {
                val2 += val.charAt(i);
                if(num!=0)queue.add(num);
                num = 0;
            }
        }
        System.out.println(val2);
        System.out.println(queue);
        val2=stringGet(val2, queue.poll());
        System.out.println(val2);

    }
    private String stringGet(String val2, int nums) {
        int i = 0, size = val2.length(),f = 0, l = 0, r = 0, j = 0,r1=0,l1=0,c=0;
        String temp="";
        for (i = 0; i < size; i++) {
            if (val2.charAt(i) == '[') {
                f++;
                if (f == 1) {
                    l = i+1;
                }
                else l1=i;
            }
            if (val2.charAt(i) == ']') {
                 f--;
                if (f == 0) {
                    if(c>0)nums=queue.poll();
                    r = i;
                    for (j = 0; j < nums; j++) {
                       temp=temp+val2.substring(l,r);
                    }
                    val2= val2.substring(0,l-1)+temp+val2.substring(r+1);
                    i=r;
                    size=val2.length();
                    temp="";
                   c++;
                } else {
                    r1=i+1;
                    val2 =val2.substring(0,l1)+stringGet(val2.substring(l1,r1), queue.poll()) + val2.substring(r1);
                    size=val2.length();
                    i=0;
                }
            }
        }
        Arrays.sort(new int[]{2,3,3,5,6});
        return val2;
    }


}
