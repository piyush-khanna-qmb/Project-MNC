/*
 * @lc app=leetcode id=53 lang=java
 *
 * [53] Maximum Subarray
 */

// @lc code=start
class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        // Normal Kadane Lagni hai
        int globalSum= nums[0];
        int curSum= nums[0];
        for(int i=1; i<nums.length; i++)
        {
            curSum= Math.max(nums[i], curSum+nums[i]);
            globalSum= Math.max(curSum, globalSum);
        }
        return globalSum;     
    }
}
// @lc code=end

