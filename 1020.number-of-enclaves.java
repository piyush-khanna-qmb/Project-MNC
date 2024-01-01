/*
 * @lc app=leetcode id=1020 lang=java
 *
 * [1020] Number of Enclaves
 */

// @lc code=start
class Solution
{
    private void dfs(int grid[][], int r, int c)
    {
        grid[r][c]= 0;
        int m= grid.length, n= grid[0].length;
        int dr[]= {0, -1, 0, 1};
        int dc[]= {-1, 0, 1, 0};
        for(int i= 0; i<4; i++)
        {
            int nr= r + dr[i];
            int nc= c + dc[i];
            if(nr>=0 && nr<m && nc>=0 && nc<n && grid[nr][nc] == 1)
                dfs(grid, nr, nc);
        }
    }

    public int numEnclaves(int[][] grid) 
    {
        //removing bullshit
        int m= grid.length, n= grid[0].length;
        for(int i= 0; i<m; i++)
        {
            for(int j= 0; j<n; j++)
            {
                if( (i==0 || i==m-1 || j==0 || j==n-1) && grid[i][j]==1)
                    dfs(grid, i, j);
            }
        }

        //counting
        int cnt= 0;
        for(int i= 0; i<m; i++)
        {
            for(int j= 0; j<n; j++)
            {
                if(grid[i][j] == 1)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
// @lc code=end