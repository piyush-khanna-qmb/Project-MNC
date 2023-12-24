/*
 * @lc app=leetcode id=994 lang=java
 *
 * [994] Rotting Oranges
 */

// @lc code=start
class Solution 
{
    static class Pair {
        int i, j;
        public Pair(int m, int n) {
            i= m;
            j= n;
        }
    }

    private void sadhaade(int m, int n, Queue<Pair> q, int grid[][], int ans[])
    {
        while(!q.isEmpty())
        {
            ans[0]++;
            int len= q.size();
            for(int tutu= 0; tutu<len; tutu++)
            {
                Pair pp= q.poll();
                int i= pp.i;
                int j= pp.j;

                if(i>0 && grid[i-1][j] == 1) {
                    q.offer(new Pair(i-1, j));
                    grid[i-1][j]= 2;
                }
                if(i<m-1 && grid[i+1][j] == 1) {
                    q.offer(new Pair(i+1, j));
                    grid[i+1][j]= 2;
                }
                if(j>0 && grid[i][j-1] == 1) {
                    q.offer(new Pair(i, j-1));
                    grid[i][j-1]= 2;
                }
                if(j<n-1 && grid[i][j+1] == 1) {
                    q.offer(new Pair(i, j+1));
                    grid[i][j+1]= 2;
                }
            }
        }
    }

    public int orangesRotting(int[][] grid) 
    {
        int ans[]= new int[1];
        int m= grid.length, n= grid[0].length;
        Queue<Pair> q= new LinkedList();
        int zers= 0;
        for(int i= 0; i<m; i++)
        {
            for(int j= 0; j<n; j++)
            {
                if(grid[i][j] == 2)
                {
                    q.offer(new Pair(i,j));
                }
                if(grid[i][j] == 0)
                {
                    zers++;
                }
            }
        }
        if(q.isEmpty() && zers == m*n)
            return 0;
        sadhaade(m, n, q, grid, ans);

        for(int i= 0; i<m; i++)
            for(int j= 0; j<n; j++)
                if(grid[i][j] == 1)
                    return -1;
        return ans[0]-1;
    }
}
// @lc code=end