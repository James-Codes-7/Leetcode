package leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NiceSubString {

    public static void main(String[] args) {

        NiceSubString niceSubString=new NiceSubString();
        System.out.println(niceSubString.programPage("YazaAay"));

    }
    private String programPage(String s)
    {
       if(s.length()<2)
           return "";
       Set<Character> set=new HashSet<>();
       for(char p:s.toCharArray())
       {
           set.add(p);
       }
       String dub="",sup="";
       int size=s.length();
       for (int i=0;i<size;i++)
       {
           if(set.contains(Character.toUpperCase(s.charAt(i)))&&set.contains(Character.toLowerCase(s.charAt(i))))
               continue;
           dub=programPage(s.substring(0,i));
           sup=programPage(s.substring(i+1));
           return dub.length()<sup.length()?sup:dub;
       }
       return s;
    }

}
