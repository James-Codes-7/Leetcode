package leetcode4;

public class IsomorphicString {

    public static void main(String[] args) {
       IsomorphicString isomorphicString=new IsomorphicString();
       isomorphicString.programLogic2();
    }
    private void programLogic2()
    {
        String s="egg",t="add";
        int[] add1=new int[26],add2=new int[26];
        int size=s.length(),i=0;
        for(i=0;i<size;i++)
        {
            add1[s.charAt(i)-'a']++;
            add2[t.charAt(i)-'a']++;
        }
        for(i=0;i<size;i++)
        {
            System.out.println(add1[s.charAt(i)-'a']+" "+add2[t.charAt(i)-'a']);
            if(add1[s.charAt(i)-'a']!=add2[t.charAt(i)-'a']) System.out.println(false);
        }
    }
}
