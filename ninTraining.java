
import java.util.*;

class Solution 
{
    private static int f(int day, int lastTask, int points[][], int dp[][])
    {
        if(day == 0)
        {
            int maxi= 0;
            for(int i= 0; i<3; i++)
            {
                if(i != lastTask)
                {
                    maxi= Math.max(maxi, points[0][i]);
                }
            }
            return maxi;
        }
        if(dp[day][lastTask]!=-1)
            return dp[day][lastTask];
        
        int maxi= 0;
        for(int i= 0; i<3; i++)
        {
            if(i != lastTask)
            {
                int thisPoint= points[day][i] + f(day-1, i, points, dp);
                maxi= Math.max(maxi, thisPoint); 
            }
        }
        return dp[day][lastTask]= maxi;
    }

    public static int ninjaTraining(int n, int points[][]) 
    {
        int dp[][]= new int[n][4];
        for(int r[]: dp)
            Arrays.fill(r, -1);

        return f(n-1, 3, points, dp);   
    }
}
