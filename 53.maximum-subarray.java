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
        // Firse taake achhe se yaad ho jaaye
        int glSum, curSum;
        glSum = curSum = nums[0];
        for(int i= 1; i<nums.length; i++) {
            curSum= Math.max(curSum+nums[i], nums[i]);
            glSum= Math.max(glSum, curSum);
        }
        return glSum;
    }
}
// @lc code=end