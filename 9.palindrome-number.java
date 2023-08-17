/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution 
{
    public boolean isPalindrome(int n) 
    {
        if(n<0)
            return false;
        if(n<10)
            return true;

        int rev= 0, t=n;
        while(n>0)
        {
            rev= rev*10 + n%10;
            n= n/10;
        }
        return rev==t;
    }
}
// @lc code=end

