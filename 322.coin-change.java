/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start
class Solution 
{
    private int f(int i, int amount, int coins[], int dp[][]) 
    {
        if(i == 0)
        {
            if(amount%coins[i] == 0)
                return amount/coins[0];
            return (int) 1e9;
        }
        if(dp[i][amount] != -1)
            return dp[i][amount];

        int take= (amount>=coins[i]) ? 1 + f(i, amount-coins[i], coins, dp) : (int) 1e9;
        int noTake= f(i-1, amount, coins, dp);

        return dp[i][amount]= Math.min(take, noTake);
    }
    public int coinChange(int[] coins, int amount) 
    {
        int dp[][]= new int[coins.length][amount+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);

        int tt= f(coins.length-1, amount, coins, dp);
        if(tt >= 1e8)
            return -1;
        return tt;
    }
}
// @lc code=end

