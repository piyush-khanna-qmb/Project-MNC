import java.util.* ;
import java.io.*; 
public class Solution 
{
    private static int f(int arr[], int tar, int i, int dp[][])
    {
        if(tar == 0)    return 1;
        if(i<0)     return 0;
        if(dp[i][tar]!=-1)      return dp[i][tar];

        int take= f(arr, tar-arr[i], i-1, dp);
        if(take == 0)
            return f(arr, tar, i-1, dp)==1;
        else
            return 1;
    }

    public static boolean subsetSumToK(int n, int k, int arr[])
    {
        int dp[][]= new int[n][k];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        return f(arr, k, n-1, dp)==1;
    }
}
