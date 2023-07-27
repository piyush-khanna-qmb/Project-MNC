/*
 * @lc app=leetcode id=680 lang=java
 *
 * [680] Valid Palindrome II
 */

// @lc code=start
class Solution 
{
    private boolean isPalin(String s, int left, int right)
    {
        while(left<right)
        {
            if(s.charAt(left)!=s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public boolean validPalindrome(String s) 
    {
        int l= 0, r= s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
                return (isPalin(s, l+1, r) || isPalin(s, l, r-1));
            l++;
            r--;
        }
        return true;
    }
}
// @lc code=end

