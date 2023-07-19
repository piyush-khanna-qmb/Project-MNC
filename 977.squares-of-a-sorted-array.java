/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution 
{
    public int[] sortedSquares(int[] a) 
    {
        for(int i= 0; i<a.length; i++)
        {
            a[i]*= a[i];
        }    
        Arrays.sort(a);
        return a;
    }
}
// @lc code=end

