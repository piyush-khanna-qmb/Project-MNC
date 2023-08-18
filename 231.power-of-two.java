/*
 * @lc app=leetcode id=231 lang=java
 *
 * [231] Power of Two
 */

// @lc code=start
class Solution 
{
    public boolean isPowerOfTwo(int n) 
    {
        while(n>0)
        {
            rem= n%2;
            if(rem!=0)
                return false;
            n/= 2;
        }
        return true;    
    }
}
// @lc code=end

