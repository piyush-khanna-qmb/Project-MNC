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
        int n= nums.length;
        if(n == 2)
            return Math.abs(nums[0]-nums[1]);
        
        int totSum= 0; 
        for(int ni: nums)
            totSum+= ni;
        
        boolean dp[][]= new boolean[n+1][totSum+1];
        for(int i= 0; i<n; i++)
            dp[i][0]= true;
        
        for(int i= 1; i<n; i++)
        {
            for(int tar= 1; tar<=totSum; tar++)
            {
                boolean take= false;
                if(tar>=nums[i])
                    take= dp[i-1][tar-nums[i]];
                boolean noTake= dp[i-1][tar];
                dp[i][tar]= take || noTake;
            }
        }

        int mini= Integer.MAX_VALUE;
        for(int i= 0; i<=(totSum/2); i++)
        {
            if(dp[n-1][i]) {
                mini= Math.min(mini, Math.abs(i-(totSum-i)));
            }
        }
        return mini;
    }
}
// @lc code=end

