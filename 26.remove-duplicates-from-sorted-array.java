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
        int l= 0, r= 0, tmp, cnt= 0;
        Map<Integer, Boolean> hm= new HashMap<>();
        while (l<a.length && r<a.length)
        {
            if(hm.containsKey(a[r]))
            {
                r++;
            }
            else 
            {
                cnt++;
                tmp= a[r];
                a[r]= a[l];
                a[l]= tmp;
                hm.put(a[l], true);
                l++;
            }
        }
        return cnt;
    }
}
// @lc code=end

