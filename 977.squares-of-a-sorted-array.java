/*
 * @lc app=leetcode id=977 lang=java
 *
 * [977] Squares of a Sorted Array
 */

// @lc code=start
class Solution 
{
    public int[] sortedSquares(int[] a) 
    {
        int p, i= 0, j= a.length-1;
        int k[]= new int[a.length];
        for(p= a.length-1; p>=0; p--)
        {
            if(Math.abs(a[i]) >= Math.abs(a[j]))
                k[p]= a[i]*a[i++];
            else
                k[p]= a[j]*a[j--];
        }
        return k;
    }
}
// @lc code=end

