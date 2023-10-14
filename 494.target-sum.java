/*
 * @lc app=leetcode id=494 lang=java
 *
 * [494] Target Sum
 * 
 * divide total array into two parts such that their s1-s2=tar.
*/

// @lc code=start
class Solution 
{
    int f(int i, int tar, int nums[], int dp[][])
    {
        if(i == 0)
		{
			if(tar == 0 && nums[0]==0)
				return 2;
			if(tar == 0 || tar == nums[0])
				return 1;
			return 0;
		}
        if(dp[i][tar] != -1)
            return dp[i][tar];
        
        int take= (tar>=nums[i]) ? f(i-1, tar-nums[i], nums, dp) : 0;
        int noTake= f(i-1, tar, nums, dp);
        return dp[i][tar]= take + noTake;
    }

    public int findTargetSumWays(int[] nums, int target) 
    {
        int tot= Arrays.stream(nums).sum();
        if(tot-target < 0 || (tot-target)%2 == 1)
            return 0;
        int tar= (tot - target)/2;

        int dp[][]= new int[nums.length][tar+1];
        return f(nums.length-1, tar, nums, dp);
    }
}
// @lc code=end

