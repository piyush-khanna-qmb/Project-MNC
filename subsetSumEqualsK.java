import java.util.* ;
import java.io.*; 
public class Solution 
{
    private static boolean f(int arr[], int tar, int i, int dp[][])
    {
        if(tar == 0)
            return true;
        if(i<0)
            return false;
        if(dp[i][tar]!= -1)
            return dp[i][tar] == 1

        boolean take= arr[i] + f(arr, tar-arr[i], i-1, dp);
        boolean noTake= false;
        if(!take)
            noTake= f(arr, tar, i-1, dp);
        
        dp[i][tar]= (take || noTake) ? 1 : 0;
        return take || noTake;
    }

    public static boolean subsetSumToK(int n, int k, int arr[])
    {
        int dp[][]= new int[n][k];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        return f(arr, k, n-1, dp);
    }
}
