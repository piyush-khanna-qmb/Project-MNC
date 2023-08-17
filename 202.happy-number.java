/*
 * @lc app=leetcode id=202 lang=java
 *
 * [202] Happy Number
 */

// @lc code=start
class Solution 
{
    private int sod(int n)
    {
        int sum= 0, r;
        while(n>0)
        {
            r= n%10;
            sum+= r*r;
            n/=10;
        }
        return sum;
    }
    public boolean isHappy(int n) 
    {
        while(n>9)
            n= sod(n);
        
        return (n==1);
    }
}
// @lc code=end

