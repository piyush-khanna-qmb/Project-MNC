/*
 * @lc app=leetcode id=494 lang=java
 *
 * [494] Target Sum
 * 
 * divide total array into two parts such that their s1-s2=tar.
*/

// @lc code=start
class Solution 
{
    private int f(int i, int tar, int arr[], int dp[][])
    {
        if(i == 0) {
            if(tar == 0 && arr[0] == 0)
                return 2;
            if(tar == 0 || arr[0] == tar)
                return 1;
            return 0;
        }
        if(tar < 0)
            return 0;

        int take= (tar>=arr[i]) ? f(i-1, tar-arr[i], arr, dp) : 0;
        int noTake= f(i-1, tar, arr, dp);

        return take+noTake;
    }

    public int findTargetSumWays(int[] nums, int target) 
    {
        int tot= 0;
        for(int ele: nums)
            tot+= ele;
        if(target > tot || (tot-target)%2!=0)
            return 0;
        
        int s2= (tot-target)/2;
        int dp[][]= new int[nums.length][s2+1];
        for(int r[] : dp)
            Arrays.fill(r, -1);
        return f(nums.length-1, s2, nums, dp); 
    }
}
// @lc code=end

