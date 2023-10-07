/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution 
{
    private int safar(int m, int n, int dp[][])
    {
        if(m==0 && n==0)
            return 1;
        if(m<0 || n<0)
            return 0;
        
        if(dp[m][n] != -1)
            return dp[m][n];

        int left= safar(m-1, n, dp);
        int up= safar(m, n-1, dp);
        return dp[m][n]= left+up;
    }
    public int uniquePaths(int m, int n) 
    {
        int dp[][]= new int[m][n];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        return safar(m-1, n-1, dp);
    }
}
// @lc code=end

