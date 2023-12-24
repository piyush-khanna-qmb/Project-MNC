/*
 * @lc app=leetcode id=200 lang=java
 *
 * [200] Number of Islands
 */

// @lc code=start
class Solution 
{
    static class Pair
    {
        int i, j;
        Pair(int I, int J) {
            i= I;
            j= J;
        }
    }

    private void BFs(int m, int n, boolean vis[][], char grid[][])
    {
        vis[m][n]= true;
        Queue<Pair> q= new LinkedList();
        q.offer(new Pair(m,n));
        while(!q.isEmpty())
        {
            Pair joda= q.poll();
            int i= joda.i;
            int j= joda.j;

            if(i>0 && grid[i-1][j]=='1' && !vis[i-1][j]) {
                vis[i-1][j]= true;
                q.add(new Pair(i-1, j));
            }
            if(i<vis.length && grid[i+1][j]=='1' && !vis[i+1][j]) {
                vis[i+1][j]= true;
                q.add(new Pair(i+1, j));
            }
            if(j>0 && grid[i][j-1]=='1' && !vis[i][j-1]) {
                vis[i][j-1]= true;
                q.add(new Pair(i, j-1));
            }
            if(j<vis[0].length && grid[i][j+1]=='1' && !vis[i][j+1]) {
                vis[i][j+1]= true;
                q.add(new Pair(i, j+1));
            }
        }
    }

    public int numIslands(char[][] grid) 
    {
        int m= grid.length, n= grid[0].length;
        boolean vis[][]= new boolean[m][n];
        int cnt= 0;
        for(int i= 0; i<m; i++)
        {
            for(int j= 0; j<n; j++)
            {
                if(!vis[i][j])
                {
                    cnt++;
                    BFs(i, j, vis, grid);
                }
            }
        }
        return cnt;
    }
}
// @lc code=end