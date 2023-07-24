/*
 * @lc app=leetcode id=238 lang=java
 *
 * [238] Product of Array Except Self
 */

// @lc code=start
class Solution 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int n= nums.length;
        // Find pros to left of i, and to right of i. Find mul at end for each

        int lefts[]= new int[n];
        int rights[]= new int[n];
        int i;
        lefts[0]= 1;
        rights[n-1]= 1;
        for(i=1; i<n; i++)
        {
            lefts[i]= lefts[i-1] * nums[i-1];
        }
        for(i=n-2; i>=0; i--)
        {
            rights[i]= rights[i+1] * nums[i+1];
        }
        for(i=0; i<n; i++)
        {
            nums[i]= lefts[i] * rights[i];
        }
        return nums;
    }
}
// @lc code=end

