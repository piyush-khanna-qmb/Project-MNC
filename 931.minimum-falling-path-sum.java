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
        int dp[]= new int[n];
        int prev[]= new int[n];
        for(int i= 0; i<n; i++)
            prev[i]= matrix[0][i];
        
        for(int r= 1; r<m; r++)
        {
            for(int c= 0; c<n; c++)
            {
                int up= prev[c];
                int lu= (c>0)? prev[c-1] : Integer.MAX_VALUE;
                int ru= (c<n-1)? prev[c+1] : Integer.MAX_VALUE;
                dp[c]= matrix[r][c]+Math.min(Math.min(up,lu),ru);
            }
            prev= Arrays.copyOf(dp, n);
        }

        int ans= Integer.MAX_VALUE;
        for(int i= 0; i<n; i++)
            ans= Math.min(ans, prev[i]);
        return ans;
    }
}
// @lc code=end