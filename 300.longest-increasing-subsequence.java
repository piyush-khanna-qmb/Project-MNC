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
        if(i == a.length)
            return 1;
        if(dp[i][j] != -1)
            return dp[i][j];

        if(a[i] > a[j])
        {
            int take= 1 + f(i+1, i, a, dp);
            int noTake= f(i+1, i, a, dp);
            return dp[i][j]= Math.max(take, noTake);
        }
        return dp[i][j]= f(i+1, j, a, dp);
    }
    public int lengthOfLIS(int[] nums) 
    {
        int n= nums.length;
        int dp[][]= new int[n][n];
        for(int r[]: dp)
            Arrays.fill(r, -1);
        return f(0, 0, nums, dp);
    }
}
// @lc code=end

