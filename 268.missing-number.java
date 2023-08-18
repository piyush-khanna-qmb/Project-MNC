/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution 
{
    public int missingNumber(int[] nums) 
    {
        int n= nums.length;
        int asliSum= n*(n+1)/2;
        int curSum= 0;
        for(int num: nums)
            curSum+= num;
        
        return asliSum-curSum;
    }
}
// @lc code=end

