/*
 * @lc app=leetcode id=122 lang=java
 *
 * [122] Best Time to Buy and Sell Stock II
 */

// For every valley that rises, there's a mountain of joy (profit) 😉

// @lc code=start
class Solution
{
    public int maxProfit(int[] a) 
    {
        int last= a[0], pro= 0;
        for(int ele: a) {
            if(ele > last)  
                pro+= (ele-last);
            last= ele;
        }
        return pro;
    }
}
// @lc code=end