/*
 * @lc app=leetcode id=322 lang=java
 *
 * [322] Coin Change
 */

// @lc code=start
class Solution 
{
    private int f(int i, int amount, int coins[])
    {
        if(i == 0) {
            if(amount%coins[0] == 0)
                return amount/coins[0];
            else
                return Integer.MAX_VALUE-1;
        }
        
        int take= (amount>=coins[i]) ? 1 + f(i, amount-coins[i], coins) : Integer.MAX_VALUE;
        int noTake= f(i-1, amount, coins);

        return Math.min(take,noTake);
    }

    public int coinChange(int[] coins, int amount) 
    {
        return f(coins.length-1, amount, coins);
    }
}
// @lc code=end

