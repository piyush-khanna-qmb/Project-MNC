class Solution 
{
    static class Junga
    {
        int num, papa;
        public Junga(int n, int p)
        {
            num= n;
            papa= p;
        }
    }

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

    private boolean bfs(int i, ArrayList<ArrayList<Integer>> adj, boolean vis[])
    {
        Queue<Junga> q= new LinkedList();
        q.offer(new Junga(i, -1));
        while(!q.isEmpty())
        {
            int len= q.size();
            for(int j= 0; j<len; j++)
            {
                Junga junga= q.poll();
                int num= junga.num, papa= junga.papa;
                for(int baaju: adj.get(num))
                {
                    if(baaju!=papa)
                    {
                        if(vis[baaju])
                            return true;
                        q.offer(new Junga(baaju, num));
                        vis[num]= true;
                    }
                }
            }
        } 

        return false;
    }
}