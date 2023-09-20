/*
 * @lc app=leetcode id=17 lang=java
 *
 * [17] Letter Combinations of a Phone Number
 */

// @lc code=start
class Solution 
{
    private void multi(List<String> ans, Map<Character, String> hm, int i, String st, StringBuilder ds)
    {
        if(i == st.length())
        {
            ans.add(new String(ds));
            return;
        }
        String here= hm.get(st.charAt(i));
        for(int j= 0; j<here.length(); j++)
        {
            ds.append(here.charAt(j));
            multi(ans, hm, i+1, st, ds);
            ds.deleteCharAt(ds.length()-1);
        }
    }

    public List<String> letterCombinations(String digits) 
    {
        if(digits.isEmpty())
            return new ArrayList();
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
        multi(ans, hm, 0, digits, new StringBuilder());
        return ans;
    }
}
// @lc code=end