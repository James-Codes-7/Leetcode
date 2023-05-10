package leetcode;

public class Maximum64Number {

    public static void main(String[] args) {

        Maximum64Number maximum64Number=new Maximum64Number();
        maximum64Number.programPage();
    }
    private void programPage()
    {
        System.out.println("Enter the number");
        int num =699,i=0,size=0;
        Integer integer=Integer.valueOf(num);
        String s=integer.toString();
        char set[]=s.toCharArray();
        size=s.length();
        for (i=0;i<size;i++)
        {
            if(set[i]=='6') {
                set[i] ='9';
                break;
            }
        }
        s=String.valueOf(set);
        System.out.println(s);
    }
}
