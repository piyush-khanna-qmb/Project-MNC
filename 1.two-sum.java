/*
 * @lc app=leetcode id=1 lang=java
 * streak ke chochle
 * [1] Two Sum
 */

// @lc code=start

import java.util.HashMap;

class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        HashMap<Integer, Integer> hm= new HashMap();
        int n= nums.length, k;
        for(int i= 0; i<n; i++)
        {
            k= target - nums[i];
            if(hm.containsKey(k)) {
                return new int[] {i, hm.get(k)};
            }
            hm.put(nums[i], i);
        }
        return new int[] {0,0};
    }
}
// @lc code=end

