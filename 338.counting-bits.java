/*
 * @lc app=leetcode id=338 lang=java
 *
 * [338] Counting Bits
 */

// @lc code=start
class Solution 
{
    public int[] countBits(int n) 
    {
        int ans[]= new int[n+1];
        for(int i= 0; i<=n; i++)
            ans[i]= ans[i/2] + (i&1);
        
        return ans;
    }
}
// @lc code=end