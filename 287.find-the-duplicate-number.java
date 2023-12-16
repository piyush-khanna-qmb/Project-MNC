/*
 * @lc app=leetcode id=287 lang=java
 *
 * [287] Find the Duplicate Number
 */

// @lc code=start
class Solution 
{
    public int findDuplicate(int[] nums) 
    {
        int ans= 1;
        for(int i= 0; i<nums.length; i++)
        {
            int k= nums[i];
            ans= ans^nums[i];
            if(ans == 0)
                return k;
        }        
    }
}
// @lc code=end

