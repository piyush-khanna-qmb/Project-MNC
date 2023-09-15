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
        if (n==1)
            return x;
        
        if(n<0)
        {
            x= 1/x;
            n= -n;
        }

        double halfPow= myPow(x, n/2);
        if(n%2 == 0)
            return halfPow * halfPow; 
        else
            return x * halfPow * halfPow;
    }
}
// @lc code=end

