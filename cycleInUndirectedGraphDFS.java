class Solution 
{
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        boolean vis[]= new boolean[V];
        boolean k;
        for(int i= 0; i<V; i++)
        {
            if(!vis[i])
            {
                k= bfs(i, adj, vis);
                if(k)   return k;
            }
        }
        return false;
    }

    private boolean dfs(ArrayList<ArrayList<Integer>> adj, boolean vis[], int n, int par)
    {
        vis[n]= true;
        for(int i: adj.get(n))
        {
            if(vis[i])
            {
                if(par == i)
                    return true;
            }
            else
            {
                boolean k= dfs(adj, vis, i, n);
                if(k)   return true;
            }
        }
        return false;
    }   
}