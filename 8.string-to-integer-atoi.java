/*
 * @lc app=leetcode id=8 lang=java
 *
 * [8] String to Integer (atoi)
 */

// @lc code=start
class Solution 
{
    public int myAtoi(String s) 
    {
        s= s.strip();
        boolean neg= false;
        long ans= 0l;
        if(s.charAt(0) == '-')
        {
            neg= true;
            s= s.substring(1);
        }
        for(int i=0; i<s.length(); i++)
        {
            char c= s.charAt(i);
            if(!Character.isDigit(c))
                break;
            ans= ans*10+ (c-'0');
            if(ans > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (-ans < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        if (neg)
            return (int)-ans;
        else
            return (int)ans;
    }
}
// @lc code=end

