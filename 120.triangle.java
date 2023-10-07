/*
 * @lc app=leetcode id=120 lang=java
 *
 * [120] Triangle
 */

// @lc code=start
class Solution 
{
    private int f(List<List<Integer>> triangle, int r, int c, int dp[][])
    {
        if(r == triangle.size()-1)
            return triangle.get(r).get(c);
        
        if(dp[r][c]!=-1)
            return dp[r][c];
        int down= f(triangle, r+1, c, dp);
        int daig= f(triangle, r+1, c+1, dp);
        return dp[r][c]= Math.min(down, daig) + triangle.get(r).get(c);
    }

    public int minimumTotal(List<List<Integer>> triangle) 
    {
        int size= 
        int dp[][]= new int[triangle.size()][triangle.get(triangle.size()-1).size()];
        for(int rr[]: dp)
            Arrays.fill(rr, -1);
        return f(triangle, 0, 0, dp);
    }
}
// @lc code=end