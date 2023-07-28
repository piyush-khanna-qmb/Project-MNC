/*
 * @lc app=leetcode id=3 lang=java
 *
 * [3] Longest Substring Without Repeating Characters
 */

// @lc code=start
class Solution 
{
    public int lengthOfLongestSubstring(String s) 
    {
        int maxLen= 0, left= 0, right;
        char newChar, firstChar;
        HashMap<Character, Integer> hm= new HashMap<>();
        for(right= 0; right<s.length(); right++)
        {
            newChar= s.charAt(right);
            if(hm.containsKey(newChar) && hm.get(newChar)>=left)
            {
                hm.put(newChar, right);
                left= hm.get(newChar)+1;
            }
            else
            {
                hm.put(newChar, right);
            }
            maxLen= Math.max(maxLen, right-left+1);
        }
        return maxLen;
    }
}
// @lc code=end

