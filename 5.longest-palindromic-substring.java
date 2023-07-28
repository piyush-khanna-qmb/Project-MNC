/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution 
{
    private int expand(String s, int left, int right)
    {
        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right-left-1;
    }
    public String longestPalindrome(String s) 
    {
        int n= s.length();
        if(n<=1)
            return s;
        
        int left= 0, right= 0, l1, l2, len;
        for(int i=0; i<n; i++)
        {
            l1= expand(s, i, i);   // Odd Palin
            l2= expand(s, i, i+1); // Even palin
            len= Math.max(l1, l2);

            if(len > right-left)
            {
                left= i - (len-1)/2;
                right= i+ len/2;
            }
        }
        return s.substring(left, right+1);
    }
}
// @lc code=end

