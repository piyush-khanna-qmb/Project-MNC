/*
 * @lc app=leetcode id=168 lang=java
 *
 * [168] Excel Sheet Column Title
 */

// @lc code=start
class Solution 
{
    public String convertToTitle(int columnNumber) 
    {
        StringBuilder sb= new StringBuilder();
        int quo, rem;
        do {
            rem= --columnNumber%26;
            sb.insert(0, (char)(rem+'A'));
            columnNumber= columnNumber/26;
        } while(columnNumber != 0);
        return sb.toString();
    }
}
// @lc code=end

