package leetcode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParathesis {
    public static void main(String[] args) {

        GenerateParathesis generateParathesis = new GenerateParathesis();
        System.out.println(generateParathesis.generateParenthesis(3));

    }

    public List<String> generateParenthesis(int n) {


        List<String> list = new ArrayList<String>();
        trackdown(list, "", 0, 0, n);
        return list;
    }

    public void trackdown(List<String> list, String str, int open, int close, int max){

        if(str.length() == max*2){
            System.out.print(" ");
            list.add(str);
            return;
        }

        if(open < max){
            System.out.print(str+"(");
            trackdown(list, str+"(", open+1, close, max);}
        if(close < open){
            System.out.print(str+")");
            trackdown(list, str+")", open, close+1, max);}
    }

}
