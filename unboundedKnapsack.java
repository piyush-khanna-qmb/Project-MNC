import java.util.*;
public class Solution 
{
    private static int f(int i, int totWeight, int profit[], int weight[], int dp[][])
    {
        if(i<0 )
            return 0;
        if(dp[i][totWeight] != -1)
            return dp[i][totWeight];

        int same= (weight[i]<=totWeight) ? profit[i] + f(i, totWeight-weight[i], profit, weight, dp) : 0;
        int prev= f(i-1, totWeight, profit, weight, dp);
        return dp[i][totWeight]= Math.max(same, prev);
    }

    public static int unboundedKnapsack(int n, int w, int[] profit, int[] weight) 
    {
        int dp[][]= new int[n][w+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        
        return f(n-1, w, profit, weight, dp);
    }
}