package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;

public class PlusOne {

    public static void main(String[] args) {
    PlusOne plusOne=new PlusOne();
        plusOne.ProgramPage();

    }
    private void ProgramPage()
    {
       LinkedList<Integer> arrayList=new LinkedList<>();
       int arr[]={9,4,5,6,7,8,9};
       int size=arr.length,i=0,val=0;
       while(i<size)
       {
         arrayList.add(arr[i++]);
       }
        System.out.println(arrayList);
       size=arrayList.size();val=1;
       i=size-1;
                   while (i>=0) {
                       val=arrayList.get(i)+val;
                       if(val>=10) {
                           arrayList.add(val % 10);
                           arrayList.remove(i);
                           val/=10;
                           i--;
                           continue;
                       }
                       else
                       {arrayList.add(i,val);arrayList.remove(i+1);val=0;}
                       break;
                   }
                   if(val!=0) {
                       arrayList.addFirst(val);
                   }
        System.out.println(arrayList);
                     size=arrayList.size();
                    arr=new int[size];
                   for (i=0;i<size;i++) {

                       arr[i]=arrayList.get(i);
                   }
           }
}
