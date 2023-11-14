/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution 
{
    public int[] twoSum(int[] a, int target) 
    {
        int i= 0, j= a.length-1;
        while(i < j)
        {
            if(a[i]+a[j] == target)
                return new int[]{i+1,j+1};
            else if(a[i]+a[j] < target)
                i++;
            else 
                j--;
        }
        return new int[]{-1, -1};
    }
}
// @lc code=end

