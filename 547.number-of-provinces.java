/*
 * @lc app=leetcode id=547 lang=java
 *
 * [547] Number of Provinces
 */

// @lc code=start
class Solution 
{
    List<List<Integer>> getAdjList(int[][] isConnected)
    {
        List<List<Integer>> adj= new ArrayList();
        for(int i= 0; i<isConnected.length; i++)
            adj.add(new ArrayList());
        
        for(int i= 0; i<isConnected.length; i++)
        {
            for(int j= 0; j<isConnected[0].length; j++)
            {
                if(i!=j && isConnected[i][j] == 1)
                    adj.get(i).add(j);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) 
    {
        if(isConnected.length <= 1)
            return isConnected.length;

        List<List<Integer>> adj= getAdjList(isConnected);
        Queue<Integer> q= new LinkedList();
        int c= 0;
        boolean vis[]= new boolean[isConnected.length];
        for(int i= 0; i<isConnected.length; i++)
        {
            if(!vis[i])
            {
                c++;
                q.offer(i);
                while(!q.isEmpty())
                {
                    int yeWala= q.poll();
                    for(int ele: adj.get(i))
                        q.offer(ele);
                }
            }
        }
        
        return c;
    }
}
// @lc code=end

