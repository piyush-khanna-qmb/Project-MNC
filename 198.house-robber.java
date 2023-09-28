/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution 
{
    private int func(int nums[], int i, int dp[])
    {
        if(i < 0)
            return 0;
        else if(i == 0)
            return nums[0];

        if(dp[i]!=-1)
            return dp[i];
        
        int pick= nums[i] + func(nums, i-2, dp);
        int noPick= func(nums, i-1, dp);

        return dp[i]= Math.max(pick, noPick);
    }
    public int rob(int[] nums) 
    {
        int dp[]= new int[nums.length];
        for(int i=0; i<nums.length; i++) {
            dp[i]= -1;
        }
        return func(nums, nums.length-1, dp);
    }
}
// @lc code=end