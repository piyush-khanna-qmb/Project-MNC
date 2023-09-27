import java.util.* ;
import java.io.*; 
public class frogJumpNinja 
{
    private static int anns(int n, int heights[], int dp[])
    {
        if(n==0)
            return 0;
        
        if(dp[n]!=0)
            return dp[n];

        int left= anns(n-1, heights, dp) + Math.abs(heights[n]-heights[n-1]);
        int right= Integer.MAX_VALUE;
        if (n>1)
            right= anns(n-2, heights, dp) + Math.abs(heights[n]-heights[n-2]);
        return dp[n]=Math.min(left, right);
    }

    public static int frogJump(int n, int heights[]) 
    {
        int dp[]= new int[n];
        dp[0]= 0;
        return anns(n-1, heights, dp);
    }
    public static void main(String args[])
    {
        int heights[]= {30, 10, 60, 10, 60, 50};
        int n= heights.length;
        System.out.println(frogJump(n, heights));
    }
}