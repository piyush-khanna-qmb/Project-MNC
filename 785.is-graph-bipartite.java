/*
 * @lc app=leetcode id=785 lang=java
 *
 * [785] Is Graph Bipartite?
 */

// @lc code=start
class Solution 
{
    private boolean bitchPlease(int i, int graph[][], int col[])
    {
        Queue<Integer> q= new LinkedList();
        q.offer(i);
        col[i]= 0;

        while(!q.isEmpty())
        {
            int th= q.poll();
            for(int ad: graph[th])
            {
                if(col[ad] == -1)
                {
                    col[ad] = (col[th]+1)%2;
                    q.offer(ad);
                }
                else if(col[ad] == col[th])
                    return false;
            }
        }
        return true;
    }

    public boolean isBipartite(int[][] graph)
    {
        int n= graph.length;
        int col[]= new int[n];
        Arrays.fill(col, -1);

        for(int i= 0; i<n; i++)
        {
            if(col[i] == -1)
            {
                boolean k= bitchPlease(i, graph, col);
                if(!k)
                    return false;
            }
        }
        return true;
    }
}
// @lc code=end

