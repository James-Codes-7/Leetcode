package leetcode;

import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

    private Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {

        ValidParanthesis validParanthesis=new ValidParanthesis();
        validParanthesis.programPage();

    }
    private void programPage()
    {
        System.out.println("Enter the paranthesis");
        String paranthesis=scanner.next();

        char arr[]=paranthesis.toCharArray();
        int i=0,j=0,size=paranthesis.length();
        Stack<Character> characters=new Stack<>();
        for(char ch:arr)
        {
            if(ch=='(')characters.push(')');
            if(ch=='{')characters.push('}');
            if(ch=='[')characters.push(']');
            if(characters.isEmpty()||characters.pop()!=ch){
                System.out.println(false);
            }
        }
        if(characters.isEmpty()) System.out.println(true);
        System.out.println(false);



    }

}
