/*
 * @lc app=leetcode id=1768 lang=java
 *
 * [1768] Merge Strings Alternately
 */

// @lc code=start
class Solution 
{
    public String mergeAlternately(String word1, String word2) 
    {
        int i= 0;
        StringBuilder sb= new StringBuilder();
        while(i<word1.length() && i<word2.length())
        {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i++));
        }
        while(i < word1.length() )
            sb.append(word1.charAt(i++));
        while(i < word2.length() )
            sb.append(word2.charAt(i++));
        
        return sb.toString();
    }
}
// @lc code=end

