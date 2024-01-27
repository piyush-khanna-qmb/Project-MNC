/*
 * @lc app=leetcode id=2645 lang=java
 *
 * [2645] Minimum Additions to Make Valid String
 */

// @lc code=start
class Solution 
{
    public int addMinimum(String word) 
    {
        Map<Character, Integer> hm= new HashMap();
        int maxy= 0;
        for(char c: word.toCharArray())
        {
            int ginti= hm.getOrDefault(c, 0)+1;
            maxy= Math.max(maxy, ginti);
            hm.put(c, ginti);
        }

        int ans= 0;
        for(char ch: new char[]{'a', 'b', 'c'})
        {
            ans+= ( maxy - hm.getOrDefault(ch, 0));
        }
        return ans;
    }
}
// @lc code=end

