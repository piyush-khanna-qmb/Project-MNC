/*
 * @lc app=leetcode id=50 lang=java
 *
 * [50] Pow(x, n)
 */

// @lc code=start
class Solution 
{
    public double myPow(double x, int n) 
    {
        if(n==0)
            return x;
        return x*myPow(x, n--);
    }
}
// @lc code=end

