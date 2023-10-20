/*
 * @lc app=leetcode id=188 lang=java
 *
 * [188] Best Time to Buy and Sell Stock IV
 */

// @lc code=start
class Solution 
{
    private int f(int i, int canBuy, int cap, int a[], int dp[][][])
    {
        if(i == a.length || cap == 0)
            return 0;
        if(dp[i][canBuy][cap] != -1)
            return dp[i][canBuy][cap];

        if(canBuy == 1)
        {
            int yes= -a[i] + f(i+1, 0, cap, a, dp);
            int nah= f(i+1, 1, cap, a, dp);
            return dp[i][canBuy][cap]= Math.max(yes, nah);
        }
        else
        {
            int yes= a[i] + f(i+1, 1, cap-1, a, dp);
            int nah= f(i+1, 0, cap, a, dp);
            return dp[i][canBuy][cap]= Math.max(yes, nah);
        }
    }

    public int maxProfit(int k, int[] prices) 
    {
        int n= prices.length;
        int dp[][][]= new int[n+1][2][k+1];

        for(int i= n-1; i>=0; i--)
        {
            for(int canBuy= 0; canBuy<=1; canBuy++)
            {
                for(int cap= 1; cap<=k; cap++)
                {
                    if(canBuy == 1)
                    {
                        int yes= -prices[i] + dp[i+1][0][cap];
                        int nah= dp[i+1][1][cap];
                        dp[i][canBuy][cap]= Math.max(yes, nah);
                    }
                    else
                    {
                        int yes= prices[i] + dp[i+1][1][cap-1];
                        int nah= dp[i+1][0][cap];
                        dp[i][canBuy][cap]= Math.max(yes, nah);
                    }
                }
            }
        }

        return dp[0][1][k];
    }
}
// @lc code=end

