/*
 * @lc app=leetcode id=953 lang=java
 *
 * [953] Verifying an Alien Dictionary
 */

// @lc code=start
class Solution 
{
    private boolean comp(String pehli, String doosri, Map<Character, Integer> hm)
    {
        for(int i=0; i<Math.min(pehli.length(), doosri.length()); i++)
        {
            int pI= hm.get(pehli.charAt(i));
            int dI= hm.get(doosri.charAt(i));
            if(pI > dI)
                return false;
            else if(pI < dI)
                return true;
        }
        if(pehli.length() > doosri.length())
            return false;
        
        return true;
    }
    public boolean isAlienSorted(String[] words, String order) 
    {
        Map<Character, Integer> hm= new HashMap();
        for(int i=0; i<26; i++)
            hm.put(order.charAt(i), i);

        for(int i=0; i<words.length-1; i++)
        {
            if(!comp(words[i], words[i+1], hm))
                return false;
        }
        return true;
    }
}
// @lc code=end