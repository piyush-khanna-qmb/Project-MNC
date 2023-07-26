/*
 * @lc app=leetcode id=560 lang=java
 *
 * [560] Subarray Sum Equals K
 */

// @lc code=start
class Solution 
{
    public int subarraySum(int[] a, int k) 
    {
        int sum= 0, i, n=a.length, cnt= 0;
        Map<Integer, Integer> hm= new HashMap();
        hm.put(0, 1);
        for(i=0; i<n; i++)
        {
            sum+= a[i];
            if(hm.containsKey(sum-k))
            {
                cnt+= hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return cnt;
    }
}
// @lc code=end

