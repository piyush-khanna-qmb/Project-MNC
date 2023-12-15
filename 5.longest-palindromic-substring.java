/*
 * @lc app=leetcode id=5 lang=java
 *
 * [5] Longest Palindromic Substring
 */

// @lc code=start
class Solution 
{
    private int expand(String s, int l, int r)
    {
        while(l>=0 && r<s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
    public String longestPalindrome(String s) 
    {
        if(s.length() <= 1)
            return s;
        int left= 0, right= 0, mxLen= 0;
        for(int i= 0; i<s.length(); i++)
        {
            int l1= expand(s, i, i); // Odd
            int l2= expand(s, i, i+1);  //Even
            int len= Math.max(l1, l2);
            
            if(mxLen < len)
            {
                mxLen= len;
                left= i - (len-1)/2;
                right= i + len/2;
            }
        }
        System.out.println(mxLen);
        return s.substring(left, right+1);
    }
}
// @lc code=end