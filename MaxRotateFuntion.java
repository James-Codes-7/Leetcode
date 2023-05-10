package leetcode4;

public class MaxRotateFuntion {

    public static void main(String[] args) {
       MaxRotateFuntion maxRotateFuntion=new MaxRotateFuntion();
        System.out.println(maxRotateFuntion.maxRotateFunction(new int[]{-8,5,-10,-5,-7,-2,-7,0,1,-10,4
                ,-2,-2,-7,-6,-6,2,7,8,-3,-4,-3,9,6,0,-6,4,1,-6,1,8,-9,-1,9,4,-10,-1,7,1,-2,3,9,5,-
                2,6,4,5,4,-8,9,-8,3,-4,2,-9,-5,3,4,-2,-8,-5,4,-7,-8,0,2,-5,8,-5,9,4,-6,8,-2,8,-4,2,1,-
                7,5,-2,6,3,-3,0,2,-8,-8,0,9,-9,-1,9,-4,5,-1,0,-9,6,3,-8,5,-2,8,5,-3,2,-2,-9,9,-2,-10,1,-2
                ,5,-5,7,-10,6,-3,6,-10,5,4,3,-4,4,-9,-5,6,0,5,2,6,-7,-6,-6,-7,1,2,7,3,0,7,9,0,6,-7,2,-3,1,7,-5,
                6,7,-2,6,-7,5,-7,6,-3,2,-4,-10,0,-1,2,3,7,-1,-2,-7,-1,2,-1,2,-3,2,-1,0,-5,-5,2,-7,7,2,-8,-3,1,-3,8,7,-7,9,2,3,-1,4,0,-8,7,-9,-7,-6,1,-4,-10,-8,-3,-10,-3,1,5,-10,-3,-3,-9,-4,-4,-8,-2,7,9,-2,-2,-10,1,-10,-8,2,5,1,-4,4,-10,9,-6,-4,-3,3,0,0,-5,2,-2,-2,4,8,-5,-1,1,-8,8,-3,0,-3,3,-5,-1,-10,-2,-9,-8,9,-8,-7,7,3,9,-4,4,3,5,-10,1,-1,-10,5,0,-8,7,9,-10,-4,-7,4,-5,3,2,-10,-10,-1,1,-5,-2,6,9,3,3,-5,2,-7,2,-4,5,-1,-9,-2,-7,9,-7,6,-6,8,-3,1,-5,-1,9,-5,1,-6,8,-2,-10,8,2,-2,4,7,-6,-7,-3,2,-8,9,-7,3,-3,-7,0,6,6,-6,-6,-1,-3,6,5,0,4,-1,5,-9,-4,6,8,0,-3,-9,-3,-2,3,-10,7,-4,-7,0,6,-2,8,4,2,-10,-4,3,-3,6,-10,7,7,0,8,5,-6,-6,-7,-4,
        }));
    }
    public int maxRotateFunction(int[] nums) {

        int i=0,k=0,j=0,size=nums.length,max=Integer.MIN_VALUE,count=0;
        size*=size;
        size-= nums.length;
        for(i=0;i<=size;i++)
        {
            count+=(j*nums[i%nums.length]);
            if(j==nums.length-1)
            {
                if(count>max)max=count;
                i--;
                j=-1;
                count=0;
            }
            j++;
        }
        return max;
    }
}
