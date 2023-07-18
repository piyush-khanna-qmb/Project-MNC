/*
 * @lc app=leetcode id=283 lang=java
 *
 * [283] Move Zeroes
 */

// @lc code=start
class Solution 
{
    public void moveZeroes(int[] a) 
    {
        int l= 0, r= l+1, t;
        while(r<a.length && l<r)
        {
            if(a[l]!=0)
            {
                l++; r++;
            } 
            else if(a[l]==0 && a[r]==0)
            {
                r++;
            }
            else
            {
                t= a[l];
                a[l++]= a[r];
                a[r++]= t;
            }
        }
    }
}
// @lc code=end

