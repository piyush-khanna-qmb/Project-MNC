/*
 * @lc app=leetcode id=64 lang=java
 *
 * [64] Minimum Path Sum
 */

// @lc code=start
class Solution 
{
    private int f(int grid[][], int r, int c, int dp[][])
    {
        if(r==0 && c==0)
            return grid[0][0];
        if(r<0 || c<0)
            return Integer.MAX_VALUE;
        if(dp[r][c]!=-1)
            return dp[r][c];
        
        int left= f(grid, r, c-1, dp);
        int up= f(grid, r-1, c, dp);
        return dp[r][c]= Math.min(left,up)+grid[r][c];
    }
    public int minPathSum(int[][] grid) 
    {
        int r= grid.length, c= grid[0].length;
        int dp[][]= new int[r][c];
        for(int row[]: dp)
            Arrays.fill(row, -1);
        return f(grid, r-1, c-1, dp);
    }
}
// @lc code=end

