/*
 * @lc app=leetcode id=63 lang=java
 *
 * [63] Unique Paths II
 */

// @lc code=start
class Solution 
{
    private int nikaaliyoBhai(int[][] obstacleGrid, int m, int n, int dp[][])
    {
        if(m>=0 && n>= 0 && obstacleGrid[m][n]==1)
            return 0;
        if(m==0 && n==0)
            return 1;
        if(m<0 || n<0)
            return 0;
        
        if(dp[m][n] != -1)
            return dp[m][n];
        
        int left= nikaaliyoBhai(obstacleGrid, m, n-1, dp);
        int up= nikaaliyoBhai(obstacleGrid, m-1, n, dp);
        return dp[m][n]= left+up;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) 
    {
        int m= obstacleGrid.length;
        int n= obstacleGrid[0].length;
        int dp[][]= new int[m][n];
        for(int row[]: dp)
            Arrays.fill(row, -1);

        return nikaaliyoBhai(obstacleGrid, m-1, n-1, dp);
    }
}
// @lc code=end