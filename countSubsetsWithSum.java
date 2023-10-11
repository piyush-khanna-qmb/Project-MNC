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
        int dp[][]= new int[num.length][tar+1];
        for(int n[]: dp)
            Arrays.fill(n, -1);
        return f(num, tar, num.length-1, dp);
    }
}