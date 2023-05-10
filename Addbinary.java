package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Addbinary {

    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        Addbinary addbinary=new Addbinary();
        addbinary.programPage();
    }
    private void programPage()
    {     String a="",b="";
    int  size1=a.length()-1,size2=b.length()-1;
        ArrayList<Integer> re=new ArrayList<>();
        int remind=0,n1=0,n2=0;
        while (size1>=0&&size2>=0)
        {
            n1=a.charAt(size1)-'0';n2=b.charAt(size2)-'0';
            int num=n1+n2+remind;
            if(num>=2)
            {
                remind=num/2;
            }
            else remind=0;
            re.add(num%2);
            size2--;
            size1--;
        }
        while (size1>=0)
        {
            n1=a.charAt(size1)-'0';
            int num=n1+remind;

            if(num>=2)
            {
                remind=num/2;
            }
            else remind=0;
            re.add(num%2);
            size1--;
        }
        while (size2>=0)
        {
            n2=b.charAt(size2)-'0';
            int num=n2+remind;
            if(num>=2)
            {
                remind=num/2;
            }
            else remind=0;
            re.add(num%2);
            size2--;
        }
        if (remind>0)re.add(remind);
        Collections.reverse(re);
        String dr="";if(re.size()==0)
        for(Integer aer:re){dr+=aer;}
    }
}
