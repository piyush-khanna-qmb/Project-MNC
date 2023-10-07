/*
 * @lc app=leetcode id=931 lang=java
 *
 * [931] Minimum Falling Path Sum
 */

// @lc code=start
class Solution 
{
    private int f(int matrix[][], int r, int c, int dp[][])
    {
        if(c<0 || c>=matrix[0].length)
            return Integer.MAX_VALUE;
        if(r==0)
            return matrix[r][c];
        if(dp[r][c] != -1)
            return dp[r][c];
        
        int up= f(matrix, r-1, c, dp);
        int lu= f(matrix, r-1, c-1, dp);
        int ru= f(matrix, r-1, c+1, dp);
        return dp[r][c]= Math.min(Math.min(up,lu),ru)+matrix[r][c];
    }

    public int minFallingPathSum(int[][] matrix) 
    {
        int mmin= Integer.MAX_VALUE;
        int dp[][]= new int[matrix.length][matrix[0].length];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        for(int i= 0; i<matrix[0].length; i++)
        {
            mmin= Math.min(mmin, f(matrix, matrix.length-1, i, dp));
        }
        return mmin;
    }
}
// @lc code=end

