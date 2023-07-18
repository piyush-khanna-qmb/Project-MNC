/*
 * @lc app=leetcode id=1480 lang=java
 *
 * [1480] Running Sum of 1d Array
 */

// @lc code=start
class Solution 
{
    public int[] runningSum(int[] a) 
    {
        for(int i=1; i<a.length; i++)
            a[i]+= a[i-1];
            
        return a;
    }
}
// @lc code=end

