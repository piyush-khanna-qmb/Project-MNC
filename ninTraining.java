if(dp[n][last] != -1)
            return dp[n][last];public class Solution
{
    private static int f(int n, int points[][], int last, int dp[][])
    {
        if(n == 0)
        {
            int maxi= 0;
            for(int i= 0; i<3; i++)
            {
                if(i != last)
                    maxi= Math.max(maxi, points[0][i]);
            }
            return maxi;
        }
        if(dp[n][last] != -1)
            return dp[n][last];

        int maxi= 0;
        for(int i=0; i<3; i++)
        {
            if(i != last)
                maxi= Math.max(maxi, points[n][i]+f(n-1, points, i, dp));
        }
        return dp[n][last]= maxi;
    }

    public static int ninjaTraining(int n, int points[][]) 
    {
        int dp[][]= new int[n][4];
        for(int i= 0; i<n; i++)
        {
            for(int j= 0; j<4; j++)
            {
                dp[i][j]= -1;
            }
        }
        return f(n-1, points, 3, dp);
    }
}