/*
 * @lc app=leetcode id=931 lang=java
 *
 * [931] Minimum Falling Path Sum
 */

// @lc code=start
class Solution 
{
    public int minFallingPathSum(int[][] matrix) 
    {
        int m= matrix.length;
        int n= matrix[0].length;
        int dp[][]= new int[m][n];
        for(int i= 0; i<n; i++)
            dp[0][i]= matrix[0][i];
        
        int ans= Integer.MAX_VALUE;
        for(int r= 1; r<m; r++)
        {
            for(int c= 0; c<n; c++)
            {
                int up= dp[r-1][c];
                int lu= c>0? dp[r-1][c-1] : Integer.MAX_VALUE;
                int ru= c<n-1? dp[r-1][c+1] : Integer.MAX_VALUE;
                dp[r][c]= matrix[r][c]+Math.min(Math.min(up,lu),ru);
            }
        }
        for(int i= 0; i<n; i++)
            ans= Math.min(ans, dp[m-1][i]);
        return ans;
    }
}
// @lc code=end

