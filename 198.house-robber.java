/*
 * @lc app=leetcode id=198 lang=java
 *
 * [198] House Robber
 */

// @lc code=start
class Solution 
{
    public int rob(int[] nums) 
    {
        int a= 0;
        int b= nums[0];

        for(int i= 1; i<nums.length; i++)
        {
            int pick= nums[i]+a;
            int noPick= b;
            nums[i]= Math.max(pick, noPick);
            a=b;
            b=nums[i];
        }
        return b;
    }
}
// @lc code=end