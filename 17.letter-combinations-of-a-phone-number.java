/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution 
{
    private List<String> multi(List<String> a, String b)
    {
        if(a.size() == 0)
        {
            for(char c: b.toCharArray())
                a.add(""+c);
            return a;
        }
        List<String> ans= new ArrayList();
        for(int i=0; i<a.size(); i++)
        {
            String sa= a.get(i);
            for(int j=0; j<b.length(); j++)
            {
                ans.add(sa+b.charAt(j));
            }
        }
        return ans;
    }

    public List<String> letterCombinations(String digits) 
    {
        Map<Character, String> hm= new HashMap();
        hm.put('2', "abc");
        hm.put('3', "def");
        hm.put('4', "ghi");
        hm.put('5', "jkl");
        hm.put('6', "mno");
        hm.put('7', "pqrs");
        hm.put('8', "tuv");
        hm.put('9', "wxyz");

        List<String> ans= new ArrayList();
        for(char c: digits.toCharArray())
        {
            String tt= hm.get(c);
            ans= multi(ans, tt);
        }
        return ans;
    }
}
// @lc code=end

