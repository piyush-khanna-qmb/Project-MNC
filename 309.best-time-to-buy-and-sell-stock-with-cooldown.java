/*
 * @lc app=leetcode id=309 lang=java
 *
 * [309] Best Time to Buy and Sell Stock with Cooldown
 */

// @lc code=start
class Solution 
{
    public int maxProfit(int[] a) 
    {
        int n= a.length;
        int dp[][]= new int[n+2][2];

        for(int i= n-1; i>=0; i--)
        {
            for(int buy= 0; buy<=1; buy++)
            {
                if(buy == 1)
                {
                    int yas= -a[i] + dp[i+1][0];
                    int nah= dp[i+1][1];
                    dp[i][buy]= Math.max(yas, nah);
                }
                else
                {
                    int yas= a[i] + dp[i+2][1];
                    int nah= dp[i+1][0];
                    dp[i][buy]= Math.max(yas, nah);
                }
            }
        }

        return dp[0][1];
    }
}
// @lc code=end

