/*
 * @lc app=leetcode id=542 lang=java
 *
 * [542] 01 Matrix
 */

// @lc code=start
class Solution 
{
    static class Bubbu
    {
        int i, j, k;
        public Bubbu(int I, int J, int K) {
            i= I;
            j= J;
            k= K;
        }
    }

    public int[][] updateMatrix(int[][] mat) 
    {
        int M= mat.length, N= mat[0].length;
        int ans[][]= new int[M][N];
        boolean vis[][]= new boolean[M][N];
        int drows[]= {0, 1, 0, -1};
        int dcols[]= {-1, 0, 1, 0};

        Queue<Bubbu> q= new LinkedList();

        for(int i= 0; i<M; i++)
        {
            for(int j= 0; j<N; j++)
            {
                if(mat[i][j] == 0)
                {
                    vis[i][j]= true;
                    q.offer(new Bubbu(i,j,0));
                }
            }
        }

        while(!q.isEmpty())
        {
            Bubbu t= q.poll();
            ans[t.i][t.j]= t.k;

            for(int i= 0; i<4; i++)
            {
                int nr= t.i + drows[i];
                int nc= t.j + dcols[i];
                if(nr>=0 && nr<M && nc>=0 && nc<N && !vis[nr][nc])
                {
                    vis[nr][nc]= true;
                    q.offer(new Bubbu(nr, nc, t.k + 1));
                }
            }
        }

        return ans;
    }
}
// @lc code=end