import java.util.* ;
import java.io.*; 

public class Solution
{
    static int f(int i, int maxWeight, int weight[], int value[], int dp[][])
    {
        if(i < 0)
            return 0;
        if(dp[i][maxWeight] != -1)
            return dp[i][maxWeight];
        
        int take= (maxWeight>=weight[i]) ? value[i] + f(i-1, maxWeight-weight[i], weight, value, dp) : Integer.MIN_VALUE;
        int notTake= f(i-1, maxWeight, weight, value, dp);

        return dp[i][maxWeight]= Math.max(take, notTake);
    }

    static int knapsack(int[] weight, int[] value, int n, int maxWeight) 
    {
        int dp[][]= new int[n][maxWeight+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        return f(n-1, maxWeight, weight, value, dp);
    }
}