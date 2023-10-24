/*
 * @lc app=leetcode id=698 lang=java
 *
 * [698] Partition to K Equal Sum Subsets
 */

// @lc code=start
class Solution 
{
    private int f(int i, int tar, int a[], int dp[][])
    {
        if(tar == 0)
            return 1;
        if(i<0)
            return 0;
        else if(dp[i][tar] != -1)
            return dp[i][tar];

        int take= (tar >= a[i]) ? f(i-1, tar-a[i], a, dp) : 0;
        int noTake= f(i-1, tar, a, dp);
        return dp[i][tar]= take+noTake;
    }

    public boolean canPartitionKSubsets(int[] nums, int k) 
    {
        int tot= Arrays.stream(nums).sum();
        if(tot%k != 0)
            return false;
        
        Arrays.sort(nums);
        int tar= tot/k;
        int dp[][]= new int[nums.length][tar+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);

        // Count number of subsets that have target= tar
        int ans= f(nums.length-1, tar, nums, dp);
        System.out.println(ans);
        return true;
    }
}
// @lc code=end