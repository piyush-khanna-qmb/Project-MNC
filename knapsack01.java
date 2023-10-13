import java.util.* ;
import java.io.*; 

public class Solution
{
    static int f(int i, int tar, int weight[], int value[], int dp[][])
    {
        if(i<0) 
            return 0;
        if(dp[i][tar] != -1)
            return dp[i][tar];

        int take= (tar>=weight[i]) ? value[i] + f(i-1, tar-weight[i], weight, value, dp) : Integer.MIN_VALUE;
        int noTake= f(i-1, tar, weight, value, dp);

        return dp[i][tar]= Math.max(take, noTake);

    }

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) 
    {
        int dp[][]= new int[n][maxWeight+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);

        return f(n-1, maxWeight, weight, value, dp);
    }
}