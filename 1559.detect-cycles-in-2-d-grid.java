/*
 * @lc app=leetcode id=1559 lang=java
 *
 * [1559] Detect Cycles in 2D Grid
 */

// @lc code=start
class Solution 
{
    private boolean kardeDFS(char mainChar, int lastr, int lastc, int i, int j, boolean vis[][], char grid[][], int m, int n)
    {        
        if(i<m-1 && grid[i+1][j] == mainChar)
        {
            if(i-1!=lastr && vis[i+1][j]==true)
            {
                System.out.println(grid[i+1][j]);
                return true;
            }
            else if(vis[i+1][j]!=true)
            {
                vis[i+1][j]= true;
                kardeDFS(mainChar, i, j, i+1, j, vis, grid, m, n);
            }
            else
                return false;
        }
        if(i>0 && grid[i-1][j] == mainChar)
        {
            if(i+1!=lastr && vis[i-1][j]==true)
            {
                System.out.println(grid[i-1][j]);
                return true;
            }
            else if(vis[i-1][j]!=true)
            {
                vis[i-1][j]= true;
                kardeDFS(mainChar, i, j, i-1, j, vis, grid, m, n);
            }
            else
                return false;
        }
        if(j<n-1 && grid[i][j+1] == mainChar)
        {
            if(j-1!=lastr && vis[i][j+1]==true)
            {
                System.out.println(grid[i][j+1]);
                return true;
            }
            else if(vis[i][j+1]!=true)
            {
                vis[i][j+1]= true;
                kardeDFS(mainChar, i, j, i, j+1, vis, grid, m, n);
            }
            else
                return false;
        }
        if(j>0 && grid[i][j-1] == mainChar)
        {
            if(j+1!=lastr && vis[i][j-1]==true)
            {
                System.out.println(grid[i][j-1]);
                return true;
            }
            else if(vis[i][j-1]!=true)
            {
                vis[i][j-1]= true;
                kardeDFS(mainChar, i, j, i, j-1, vis, grid, m, n);
            }
            else
                return false;
        }
        return false;
    }

    public boolean containsCycle(char[][] grid) 
    {
        int m= grid.length, n= grid[0].length;
        boolean vis[][]= new boolean[m][n];

        for(int i= 0; i<m; i++)
        {
            for(int j= 0; j< n; j++)
            {
                if(!vis[i][j] && kardeDFS(grid[i][j], -1, -1, i, j, vis, grid, m, n))
                    return true;
            }
        }
        return false;
    }
}
// @lc code=end