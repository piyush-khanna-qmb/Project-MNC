/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution 
{
    public int uniquePaths(int m, int n) 
    {
        double ans= 1;
        for(int i= 1; i<=m-1; i++)
            ans= ans*(n-1+i)/i;
        
        return (int)ans;
    }
}
// @lc code=end