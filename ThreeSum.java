package leetcode;

import java.util.*;

public class ThreeSum {


    public static void main(String[] args) {

        ThreeSum threeSum=new ThreeSum();

    }
    private List<List<Integer>> programPage()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the arraySize");
        int size=scanner.nextInt();


        int nums[]=new int[size],i=0,j=0,temp=0,third=0,first=0,second=0,count=0,sort[]=new int[3];
        LinkedHashSet<List<Integer>> set=new LinkedHashSet<>();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (i=0;i<size;i++)
        {
            temp=scanner.nextInt();
            nums[i]=temp;
            hashMap.put(temp, hashMap.getOrDefault(temp,0)+1);
        }
        for (i=0;i<size-1;i++)
        {
            first=nums[i];
            for (j=i+1;j<size;j++)
            {
              second=nums[j];
              third= -(first + second);
              if(hashMap.containsKey(third)) {
                  count = hashMap.get(third);
                  if (first == third && second == third && count == 2) continue;
                  if ((third == first || second == first) && count == 1) continue;
                  sort[0] = first;
                  sort[1] = second;
                  sort[2] = third;
                  Arrays.sort(sort);
                  List<Integer> list=new ArrayList<>(Arrays.asList(sort[0],sort[1],sort[2]));
                  set.add(list);
              }
            }
        }
        return new ArrayList<List<Integer>>(set);
    }
}
