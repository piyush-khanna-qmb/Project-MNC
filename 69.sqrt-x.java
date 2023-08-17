/*
 * @lc app=leetcode id=69 lang=java
 *
 * [69] Sqrt(x)
 */

// @lc code=start
class Solution 
{
    public int mySqrt(int n) 
    {
        long l= 0, r= n, mid, ans= 0l;
        while(l<=r)
        {
            mid= l+ (r-l)/2;
            if(mid*mid < n)
            {
                ans= mid;
                l= mid+1;
            }
            else if(mid*mid > n)
            {
                r= mid-1;
            }
            else
                return (int) mid;
        }
        return (int) ans;
    }
}
// @lc code=end

