/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution 
{
    public int maxArea(int[] a) 
    {
        int i= 0, j= a.length-1, l, b, Mar= -1;
        while(i<=j)
        {
            l= j-i;
            b= Math.min(a[i], a[j]);
            if(l*b > Mar)
                Mar= l*b;

            if(a[i] > a[j])
                j--;
            else
                i++;
        }
        return Mar;
    }
}
// @lc code=end

