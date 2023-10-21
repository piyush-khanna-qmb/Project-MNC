/*
 * @lc app=leetcode id=188 lang=java
 *
 * [188] Best Time to Buy and Sell Stock IV
 */

// @lc code=start
class Solution 
{
    public int maxProfit(int k, int[] prices) 
    {
        int n= prices.length;
        int dp[][][]= new int[n+1][2][k+1];
        
        for(int i= n-1; i>=0; i--)
        {
            for(int canBuy= 0; canBuy<=1; canBuy++)
            {
                for(int cap= k; cap>=1; cap--)
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