import java.util.*;
import java.io.*;

public class Solution
{
    private static int f(int arr[], int tar, int i, int dp[][])
    {
        int mod= (int) Math.pow(10,9)+7;
        if(tar == 0)
            return 1;
        if(i<0)
            return 0;
        
        if(dp[i][tar]!=-1)
            return dp[i][tar];
        int take= (tar>=arr[i]) ? f(arr, tar-arr[i], i-1, dp)%mod : 0;
        int notTake= f(arr, tar, i-1, dp)%mod;

        return dp[i][tar]= take+notTake;
    }
    public static int findWays(int num[], int tar) 
    {
        int n= num.length;
        int dp[][]= new int[n][tar+1];
        for(int i= 0; i<n; i++)
            dp[i][0]= 1;
        int mod= (int) Math.pow(10,9)+7;

        for(int i= 1; i<n; i++)
        {
            for(int j= 1; j<=tar; j++)
            {
                int take= (j>=arr[i]) ? f(arr, tar-arr[i], i-1, dp)%mod : 0;
                int notTake= f(arr, tar, i-1, dp)%mod;
                dp[i][tar]= take+notTake;
            }
        }

    }
}