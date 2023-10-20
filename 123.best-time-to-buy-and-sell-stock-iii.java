/*
 * @lc app=leetcode id=123 lang=java
 *
 * [123] Best Time to buy and Sell Stock III
 */

// @lc code=start
class Solution 
{
    private int f(int i, int canBuy, int cap, int a[], int dp[][][])
    {
        if(cap == 0 || i == a.length)
            return 0; 
        if(dp[i][canBuy][cap] != -1)
            return dp[i][canBuy][cap];
        
        if(canBuy == 1)
        {
            int yaas= -a[i] + f(i+1, 0, cap, a, dp);
            int nah= f(i+1, 1, cap, a, dp);
            return dp[i][canBuy][cap]= Math.max(yaas, nah);
        }
        else
        {
            int yaas= a[i] + f(i, 1, cap-1, a, dp);
            int nah= f(i+1, 0, cap, a, dp);
            return dp[i][canBuy][cap]= Math.max(yaas, nah);
        }
    }
    public int maxProfit(int[] prices) 
    {
        int dp[][][]= new int[prices.length][2][3];
        for(int r[][]: dp)
            for(int c[]: r)
                Arrays.fill(c, -1);
        
        return f(0, 1, 2, prices, dp);
    }
}
// @lc code=end

