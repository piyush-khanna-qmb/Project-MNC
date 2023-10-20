/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// @lc code=start
class Solution
{
    private int f(int i, int buy, int a[], int dp[][])
    {
        if(i == a.length)
            return 0;
        if(dp[i][buy] != -1)
            return dp[i][buy];

        if(buy == 1)
        {
            int yes= -a[i] + f(i+1, 0, a, dp);
            int nah= f(i+1, 1, a, dp);
            return dp[i][buy]= Math.max(yes, nah);
        }
        else
        {
            int yes= a[i] + f(i, 1, a, dp);
            int nah= f(i+1, 0, a, dp);
            return dp[i][buy]= Math.max(yes, nah);
        }
    }
    public int maxProfit(int[] a) 
    {
        int dp[][]= new int[a.length][2];
        for(int r[]: dp)
            Arrays.fill(r, -1);

        return f(0, 1, a, dp);
    }
}
// @lc code=end