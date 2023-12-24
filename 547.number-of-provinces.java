/*
 * @lc app=leetcode id=547 lang=java
 *
 * [547] Number of Provinces
 */

// @lc code=start
class Solution 
{
    public int findCircleNum(int[][] isConnected) 
    {
        if(isConnected.length <= 1)
            return isConnected.length;

        int cnt= 0, n= isConnected.length;
        boolean vis[]= new boolean[n];
        Queue<Integer> q= new LinkedList();
        for(int i= 0; i<n; i++)
        {
            if(!vis[i])
            {
                vis[i]= true;
                cnt++;
                q.offer(i);
                while(!q.isEmpty())
                {
                    int len= q.size();
                    for(int j= 0; j<len; j++)
                    {
                        int ele= q.poll();
                        vis[ele]= true;
                        for(int k= 0; k<n; k++)
                        {
                            if(isConnected[ele][k] == 1 && !vis[ele])
                                q.offer(k);
                        }
                    }
                }
            }
        }
        return cnt;
    }
}
// @lc code=end

