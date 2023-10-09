/*
 * @lc app=leetcode id=416 lang=java
 *
 * [416] Partition Equal Subset Sum
 */

// @lc code=start
class Solution 
{
    public boolean canPartition(int[] nums) 
    {
        int sum= 0;
        for(int n: nums)
            sum+= n;
        
        if(sum%2 == 1)
            return false;
        
        int n= nums.length;
        boolean dp[][]= new boolean[n+1][sum/2 + 1];
        
        for(int i= 0; i<n; i++)
            dp[i][0]= true;
        
        for(int i= 1; i<=n-1; i++)
        {
            for(int tar= 1; tar<=sum/2; tar++)
            {
                boolean take= false;
                if(tar>=nums[i])
                    take= dp[i-1][tar-nums[i]];
                boolean noTake= dp[i-1][tar];
                dp[i][tar]= take || noTake;
            }
        }
        return dp[n-1][sum/2];
    }
}
// @lc code=end