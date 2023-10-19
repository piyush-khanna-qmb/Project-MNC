/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start
class Solution 
{
    private int f(int i, int tar, int coins[], int dp[][])
    {
        if(i == 0)
        {
            if(tar%coins[i] == 0)
                return tar/coins[i];
            return (int) 1e7;
        }
        if(dp[i][tar] != -1)
            return dp[i][tar];
        
        int yahi= (tar>=coins[i]) ? 1 + f(i, tar-coins[i], coins, dp) : (int) 1e7;
        int prev= f(i-1, tar, coins, dp);
        return dp[i][tar]= Math.min(yahi, prev);
    }

    public int coinChange(int[] coins, int amount) 
    {
        int dp[][]= new int[coins.length][amount+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        
        int ans= f(coins.length-1, amount, coins, dp);
        if(ans >= 1e7)
            return -1;
        return ans;
    }
}
// @lc code=end