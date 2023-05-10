package leetcode;

import java.util.ArrayList;

public class OnlineStockSpan {

    static int count=0;
    ArrayList<Integer> integers=new ArrayList<>();
    public OnlineStockSpan()
    {
        tr();
    }
    public void tr()
    {

    }
    public static void main(String[] args) {

        OnlineStockSpan onlineStockSpan=new OnlineStockSpan();
        onlineStockSpan.programLogic();
    }
    private void programLogic()
    {
        int arr[]={100,80,60,70,60,75,85};
        int size=arr.length,stack=0;
        int b=9;
        double a=b;
        //Float s=9;Double c=9;Error    Wrapper cannot type conversion
        float v=2;
         for(int i=0;i<size;i++)
         {
            count=1;
            i=integers.size()-1;
            while (i>0&&integers.get(i)<arr[i])
            {
                count++;
                i--;
            }
            integers.add(arr[i]);


         }
    }

}
