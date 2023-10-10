/*
 * @lc app=leetcode id=2035 lang=java
 *
 * [2035] Partition Array Into Two Arrays to Minimize Sum Difference
 */

// @lc code=start
class Solution 
{
    public int minimumDifference(int[] nums) 
    {
        int totSum= Arrays.stream(nums).sum();
        int target= totSum/2;
        boolean dp[]= new boolean[target+1];
        dp[0]= true;
        for(int num: nums)
        {
            for(int i= target; i>=num; i--)
            {
                dp[i]= dp[i] || dp[i-num];
            }
        }

        int maax= 0;
        for(int i= target; i>=0; i--)
        {
            if(dp[i])
            {
                maax= i;
                break;
            }
        }
        return Math.abs(totSum - 2*maax);
    }
}

