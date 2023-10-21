/*
 * @lc app=leetcode id=300 lang=java
 *
 * [300] Longest Increasing Subsequence
 */

// @lc code=start
class Solution 
{
    private int f(int i, int j, int a[], int dp[][])
    {
        if(i > a.length)
            return 0;
        if(dp[i][j] != -1)
            return dp[i][j];

        if(j == 0 || a[i-1] > a[j-1])
        {
            int take= 1 + f(i+1, i, a, dp);
            int noTake= f(i+1, j, a, dp);
            return dp[i][j]= Math.max(take, noTake);
        }
        return dp[i][j]= f(i+1, j, a, dp);
    }
    public int lengthOfLIS(int[] nums) 
    {
        int n= nums.length;
        int dp[][]= new int[n+1][n+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        return f(1, 0, nums, dp);
    }
}
// @lc code=end