/*
 * @lc app=leetcode id=26 lang=java
 *
 * [26] Remove Duplicates from Sorted Array
 */

// @lc code=start
class Solution 
{
    public int removeDuplicates(int[] a) 
    {
        int p= 0;
        if(a.length == 0)
            return 0;
        
        for(int i= 1; i<a.length; i++)
        {
            if(a[i] != a[p])
                a[++p]= a[i];
        }
        return p+1;
    }
}
// @lc code=end

