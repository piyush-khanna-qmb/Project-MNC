/*
 * @lc app=leetcode id=7 lang=java
 *
 * [7] Reverse Integer
 */

// @lc code=start
class Solution 
{
    public int reverse(int x) 
    {
        if ((x<=9 && x>=0) || (x<=0 && x>=-9))
            return x;
        long rev= 0;

        while (x!=0)
        {
            rev= rev*10 + x%10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE)
                return 0;
            x= x/10;
        }
        
        return (int) rev;
    }
}
// @lc code=end

