package leetcode;

import java.util.HashMap;

public class SearchInsertPosition {

    public static void main(String[] args) {

        SearchInsertPosition searchInsertPosition=new SearchInsertPosition();
        searchInsertPosition.programPage();
    }
    private void programPage()
    {
        System.out.println();
        int nums[]={1,2,3,4};
        int i=0,j=0,k=0,size=nums.length;
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        while(i<size)
        {
            hashMap.put(i,nums[i]);
            i++;
        }

    }
}
