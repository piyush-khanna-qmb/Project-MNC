/*
 * @lc app=leetcode id=347 lang=java
 *
 * [347] Top K Frequent Elements
 */

// @lc code=start
class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        int ans[]= new int[k];
        Map<Integer, Integer> hm= new HashMap();

        for(int n: nums)
            hm.put(n, hm.getOrDefault(n, 0) + 1);
        
        Queue<Integer> mHeap= new PriorityQueue( 
            (a,b) -> hm.get(a)-hm.get(b) 
        );

        for(int key: hm.keySet())
        {
            mHeap.add(key);
            if(mHeap.size() > k)
                mHeap.poll();
        }

        int bharna= 0;
        while(!mHeap.isEmpty())
            ans[bharna++]= mHeap.poll();
            
        return ans;
    }
}
// @lc code=end

