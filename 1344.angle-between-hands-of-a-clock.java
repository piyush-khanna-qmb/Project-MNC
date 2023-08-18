/*
 * @lc app=leetcode id=1344 lang=java
 *
 * [1344] Angle Between Hands of a Clock
 */

// @lc code=start
class Solution 
{
    public double angleClock(int hour, int minutes) 
    {
        double jj= Math.abs((double)hour*30.0 - (11.0/2)*minutes);
        return Math.min(jj, 360.0-jj);
    }
}
// @lc code=end