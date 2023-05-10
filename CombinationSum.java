package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CombinationSum {

    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter the array size");
        int size=scan.nextInt();

        int candidates[]=new int[size],i=0,j=0,temp=0,k=0,extra=0;

        System.out.println("Enter the elements to the array");
        for(i=0;i<size;i++)
        {
            candidates[i]=scan.nextInt();
        }

        List<Integer> lo=null;
        System.out.println("Enter the target");
        int target=scan.nextInt(),f=0;;
        List<Integer> l=null;
        for(i=0;i<size;i++)
        {
            if(target%candidates[i]>0)
            {
                temp=target/candidates[i];
                extra=target%candidates[i];
                for(j=0;j<size;j++)
                {
                    f=0;
                    if(target==candidates[i])break;
                    if(i!=j&&candidates[j]==extra)
                    {
                        f=1;
                        j=candidates[j];break;
                    }
                    else if(i!=j&&candidates[j]==extra+candidates[i])
                    {
                        temp--;
                        f=1;
                        j=candidates[j]; break;
                    }
                }
                if(f==1) {
                    System.out.print("[");
                    lo=new ArrayList<>();
                    for(k=0;k<temp;k++)
                    {
                        lo.add(candidates[i]);
                        System.out.print(candidates[i]+" ");
                    }
                    lo.add(j);
                    System.out.print(j+"]");
                }
            }
          else  if(target%candidates[i]==0)
            {
                System.out.print("[");
                lo=new ArrayList<>();
                for(k=0;k<target/candidates[i];k++)
                {
                    lo.add(candidates[i]);
                    System.out.print(candidates[i]+" ");
                }
                System.out.print("]");
            }
        }
    }
}
