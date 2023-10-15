/*
 * @lc app=leetcode id=13 lang=java
 *
 * [13] Roman to Integer
 */

// @lc code=start
class Solution 
{
    private void initialiseMap(Map<String, Integer> hm)
    {
        hm.put("I", 1);
        hm.put("V", 5);
        hm.put("X", 10);
        hm.put("L", 50);
        hm.put("C", 100);
        hm.put("D", 500);
        hm.put("M", 1000);
    }
    public int romanToInt(String s) 
    {
        Map<String, Integer> hm= new HashMap<>();
        initialiseMap(hm);
        int i, prev= 0, cur, sum= 0;
        for(i=s.length()-1; i>=0; i--)
        {
            cur= hm.get(s.charAt(i)+"");
            if(cur<prev)
                sum-= cur;
            else
                sum+= cur;
            prev= cur;
        }
        return sum;
    }
}
// @lc code=end
