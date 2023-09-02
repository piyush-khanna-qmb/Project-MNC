/*
 * @lc app=leetcode id=125 lang=java
 *
 * [125] Valid Palindrome
 */

// @lc code=start
class Solution 
{
    private boolean Pali(String s, int c)
    {
        if(c>s.length()/2)
            return true;
        if(s.charAt(c)!=s.charAt(s.length()-1-c))
            return false;
        return Pali(s, c+1);
    }
    private String removeBullshit(String s)
    {
        StringBuilder sb= new StringBuilder();
        for(char c: s.toCharArray())
            if(Character.isLetter(c))   sb.append(c);
        return sb.toString();
    }
    public boolean isPalindrome(String s) 
    {
        s= removeBullshit(s);
        return Pali(s, 0);
    }
}
// @lc code=end

