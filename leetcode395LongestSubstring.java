package leetcode4;

public class leetcode395LongestSubstring {

    public static void main(String[] args) {
        leetcode395LongestSubstring leetcode395LongestSubstring=new leetcode395LongestSubstring();
        leetcode395LongestSubstring.programLogic();
    }
    private void programLogic()
    {
        System.out.println(longestSubstring("ababbc",2));
    }
    public int longestSubstring(String s, int k) {

        int[] arr=new int[26];
        int i=0,j=0,size=s.length();
        for(i=0;i<size;i++)
        {
            arr[s.charAt(i)-'a']++;
        }
        for(i=size-1;i>=0;i--)
        {
            arr[s.charAt(i)-'a']--;
            if(isValid(arr,k))break;
        }
        return max;
    }
    int max=0;
    private boolean isValid(int[] arr,int k)
    {
        int i=0,count=0;
        for(i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                count+=arr[i];
                if(arr[i]<k)return false;

            }
        }
        max=count>max?count:max;
        return true;
    }
}
