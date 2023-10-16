/*
 * @lc app=leetcode id=518 lang=java
 *
 * [518] Coin Change II
 */

// @lc code=start
class Solution 
{
    private int f(int i, int amount, int coins[], int dp[][])
    {
        if(amount == 0)
            return 1;
        if(i<0)
            return 0;
        if(dp[i][amount] != -1)
            return dp[i][amount];
            
        int same= (amount>=coins[i]) ? f(i, amount-coins[i], coins, dp) : 0;
        int prev= f(i-1, amount, coins, dp);

        return dp[i][amount]= same+prev;
    }

    public int change(int amount, int[] coins) 
    {
        int dp[][]= new int[coins.length][amount+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        
        return f(coins.length-1, amount, coins, dp);
    }
}
// @lc code=end