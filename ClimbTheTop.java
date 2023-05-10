package leetcode;

import java.util.HashSet;

public class ClimbTheTop {

    private int count=0;
    HashSet<String> set=new HashSet<>();
    public static void main(String[] args) {
        ClimbTheTop climbTheTop=new ClimbTheTop();
        climbTheTop.programPage();
    }
    public void programPage() {

        int steps=0,f=0,l=1;
        for (int i=0;i<6;i++)
        {
            steps=l+f;
            f=l;
            l=steps;
        }
        System.out.println(steps);
    }
}
