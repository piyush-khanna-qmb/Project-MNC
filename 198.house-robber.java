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
        if(nums.length == 1)
            return nums[0];

        int a= 0;
        int b= nums[0];
        int c= b;
        for(int i= 1; i<nums.length; i++) {
            c= Math.max(a+nums[i] , b);
            a= b; 
            b= c;
        }
        return c;
    }
}
// @lc code=end