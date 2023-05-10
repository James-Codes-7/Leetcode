package leetcode;

import java.util.*;

public class LongestPalindrom {

    public static void main(String[] args) {

        LongestPalindrom palindrom = new LongestPalindrom();
        palindrom.programPage();

    }

    private void programPage() {
        String words[] = {"em", "pe", "mp", "ee", "pp", "me", "ep", "em", "em", "me"};
        HashMap<String, Integer> stringHashMap = new HashMap<>();
        int i = 0, size = words.length, count = 0;
        String d = "";
        for (i = 0; i < size; i++) {
            stringHashMap.put(words[i], stringHashMap.getOrDefault(words[i], 0) + 1);
        }
        int a = 0, temp = 0;
        System.out.println(stringHashMap);
        Set<String> setList = stringHashMap.keySet();
        for (String s : setList) {
            if(stringHashMap.get(s)==0)continue;
            d = s.charAt(1) + "" + s.charAt(0);
            if(d.equals(s)&&count==0&&stringHashMap.get(d)%2==1)
            {count=1;a+=1*2;}
            else if(d.equals(s))
            {
                a+=stringHashMap.get(d)/2*4;
                stringHashMap.put(d,0);
            }
           else if(stringHashMap.containsKey(d)) {
                a+=Math.min(stringHashMap.get(d),stringHashMap.get(s))*4;
                stringHashMap.put(d,0);
                stringHashMap.put(s, 0);
            }
        }
        System.out.println((a));
    }
}
