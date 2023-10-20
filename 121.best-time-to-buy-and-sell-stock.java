/*
 * @lc app=leetcode id=121 lang=java
 *
 * [121] Best Time to Buy and Sell Stock
 */

// @lc code=start
class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int totPro= 0, curPro= 0, min= prices[0];
        for(int ele: prices)
        {
            min= Math.min(min, ele);
            curPro= ele - min;
            totPro= Math.max(totPro, curPro); 
        }
        return totPro;
    }
}
// @lc code=end

