/*
 * @lc app=leetcode id=213 lang=java
 *
 * [213] House Robber II
 */

// @lc code=start
class Solution 
{
    public int chorBKL(int nums[], int i, int dp[])
    {
        if(i < 0)
            return 0;
        if(i == 0)
            return dp[i]= nums[i];

        if(dp[i]!=-1)
            return dp[i];

        int pick= nums[i] + chorBKL(nums, i-2, dp);
        int noPick= chorBKL(nums, i-1, dp);

        return dp[i]= Math.max(pick, noPick);
    }
    public int rob(int[] nums) 
    {
        int n= nums.length;
        if(n==1)
            return nums[0];
        int dp[]= new int[n];
        Arrays.fill(dp, -1);

        int noFirst= chorBKL(Arrays.copyOfRange(nums, 1, n), n-2, dp);  // Yahaan n-1 ki jagah n-2 aayega kyuki length hamne ek se kam kar di hai
        Arrays.fill(dp, -1);
        int noLast= chorBKL(nums, n-2, dp);
        return Math.max(noFirst, noLast);
    }
}
// @lc code=end