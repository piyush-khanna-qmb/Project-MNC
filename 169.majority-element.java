/*
 * @lc app=leetcode id=169 lang=java
 *
 * [169] Majority Element
 */

// @lc code=start

class Solution 
{
    public int majorityElement(int[] nums) 
    {
        Map<Integer, Integer> hm= new HashMap();
        for(int num: nums)
            hm.put(num, hm.getOrDefault(num, 0)+1);
        
        int atleast= (int) Math.floor(nums.length/2);
        int entNum, entCnt;
        for(Map.Entry<Integer, Integer> entry: hm.entrySet())
        {
            entNum= entry.getKey();
            entCnt= entry.getValue();
            if(entCnt > atleast)
                return entNum;
        }
        return -1;
    }
}
// @lc code=end

