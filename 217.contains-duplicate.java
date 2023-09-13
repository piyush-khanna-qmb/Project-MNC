/*
 * @lc app=leetcode id=217 lang=java
 *
 * [217] Contains Duplicate
 */

// @lc code=start
class Solution 
{
    public boolean containsDuplicate(int[] nums) 
    {
        Set<Integer> hui= new HashSet();
        for(int n: nums) 
        {
            if(hui.contains(n))
                return true;
            hui.add(n);
        }
        return false;
    }
}
// @lc code=end

