/*
 * @lc app=leetcode id=130 lang=java
 *
 * [130] Surrounded Regions
 */

// @lc code=start
class Solution 
{
    private void dfs(char grid[][], int i, int j)
    {
        grid[i][j]= 'Y';
        int dr[]= {0, -1, 0, 1};
        int dc[]= {-1, 0, 1, 0};

        for(int k= 0; k<4; k++)
        {
            int nr= i + dr[k];
            int nc= j + dc[k];
            if(nr>=0 && nc>=0 && nr<grid.length && nc<grid[0].length && grid[nr][nc]=='O')
            {
                dfs(grid, nr, nc);
            }
        }
    }

    public void solve(char[][] board) 
    {
        int m= board.length, n= board[0].length;
        for(int i= 0; i<m; i++)
        {
            for(int j= 0; j<n; j++)
            {
                if((i==0 || j==0 || i==m-1 || j==n-1) && board[i][j]=='O')
                {
                    dfs(board, i, j);
                }
            }
        }

        for(int i= 0; i<m; i++)
        {
            for(int j= 0; j<n; j++)
            {
                if(board[i][j] == 'O')
                    board[i][j]= 'X';
                else if(board[i][j] == 'Y')
                    board[i][j]= 'O';
            }
        }
    }
}
// @lc code=end