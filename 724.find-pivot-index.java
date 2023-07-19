/*
 * @lc app=leetcode id=724 lang=java
 *
 * [724] Find Pivot Index
 */

// @lc code=start
import java.util.*;
class Solution 
{
    public int pivotIndex(int[] nums) 
    {
        int tSum= 0;
        for(int i: nums)
            tSum+= i;
        int cSum= 0;
        for(int i=0; i<nums.length; i++)
        {
            if(cSum == (tSum-cSum-nums[i]))
                return i;
            cSum= cSum + nums[i];
        }
        return -1;
    }
}
// @lc code=end

