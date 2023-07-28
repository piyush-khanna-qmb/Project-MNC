/*
 * @lc app=leetcode id=28 lang=java
 *
 * [28] Find the Index of the First Occurrence in a String
 */

// @lc code=start
class Solution 
{
    public int strStr(String haystack, String needle) 
    {
        int i, j= 0;
        for(i=0; i<haystack.length(); i++)
        {
            if(haystack.charAt(i)==needle.charAt(j))
                j++;
            else
                j=0;
            if(j==needle.length())
            {
                i= i-j+1;
                return i;
            }
        }
        return -1;
    }
}
// @lc code=end

