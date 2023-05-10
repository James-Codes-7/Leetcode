package leetcode;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class MakeTheStringGood {

    public static void main(String[] args) {

        MakeTheStringGood makeTheStringGood = new MakeTheStringGood();
        makeTheStringGood.programPage();
    }

    private void programPage() {
        System.out.println("Enter the string");
        String s = "leeEetcode";
        int i = 0, size = s.length(), j = 0;
        char temp = '-', sp = '-';
        char arr[] = s.toCharArray();
        ArrayList<Character> arrayList = new ArrayList<>();
        for (i = 0; i < size; i++) {
            temp = s.charAt(i);
            if (temp >= 'A' && temp <= 'Z') {
                sp = (char) (temp + 32);
                if (j != 0 && arrayList.get(j - 1) == sp) {
                    arrayList.remove(j - 1);
                    j--;
                } else {
                    arrayList.add(temp);
                    j++;
                }
            } else {
                sp = (char) (temp - 32);
                if (j != 0 && arrayList.get(j - 1) == sp) {
                    arrayList.remove(j - 1);
                    j--;
                } else {
                    arrayList.add(temp);
                    j++;
                }
            }
        }
        s="";size=arrayList.size();
        for(i=0;i<size;i++)
        {
           s+=arrayList.get(i);
        }
        System.out.println(s);
    }
}
