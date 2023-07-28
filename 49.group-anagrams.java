/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution 
{
    private String sortIt(String s)
    {
        char chs[]= s.toCharArray();
        Arrays.sort(chs);
        return new String(chs);
    }

    public List<List<String>> groupAnagrams(String[] strs)
    {
        List<List<String>> outer= new ArrayList();
        Map<String, Integer> hm= new HashMap();

        //Sorting each
        String sortedStrs[] = new String[strs.length];
        for(int i=0; i<strs.length; i++)
            sortedStrs[i]= sortIt(strs[i]);
        
        // Putting in hashmap
        int i= 0;
        for(String wrd: sortedStrs)
        {
            if(!hm.containsKey(wrd))
            {
                hm.put(wrd, i++);
                outer.add(new ArrayList<String>());
            }
        }

        for(i=0; i<strs.length; i++)
        {
            outer.get(hm.get(sortedStrs[i])).add(strs[i]);
        }

        return outer;
    }
}
// @lc code=end

