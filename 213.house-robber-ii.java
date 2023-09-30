/*
 * @lc app=leetcode id=213 lang=java
 *
 * [213] House Robber II
 */

// @lc code=start
class Solution 
{
    public int func(int nums[], int i, boolean noFir, int dp[])
    {
        if(i < 0)
            return 0;
        else if(i==0)
        {
            if(noFir)
                return 0;
            return nums[0];
        }
        if(dp[i]!=-1)
            return dp[i];
        int pick= nums[i] + func(nums, i-2, noFir, dp);
        int noPick= func(nums, i-1, noFir, dp);

        return dp[i]= Math.max(pick, noPick);
    }
    public int rob(int[] nums) 
    {
        if(nums.length==1)
            return nums[0];
        int n= nums.length;
        int dp[]= new int[n];
        for(int i=0; i<n; i++)
            dp[i]= -1;
        int noFirst= func(nums, n-1, true, dp);
        int noLast= func(nums, n-2, false, dp);
        return Math.max(noFirst, noLast);
    }
}
// @lc code=end