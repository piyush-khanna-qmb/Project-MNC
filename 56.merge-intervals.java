/*
 * @lc app=leetcode id=56 lang=java
 *
 * [56] Merge Intervals
 */

// @lc code=start
class Solution 
{
    public int[][] merge(int[][] intervals) 
    {
        Arrays.sort(intervals, (a,b) -> (a[0]-b[0]));

        List<int[]> out= new ArrayList<>();
        for(int[] event: intervals)
        {
            if(out.isEmpty() || event[0] > out.get(out.size()-1)[1])
            {
                out.add(event);
            }
            else
            {
                int lastEvent[]= out.get(out.size()-1);
                lastEvent[1]= Math.max(lastEvent[1], event[1]); 
            }
        }

        int ans[][]= new int[out.size()][2];
        out.toArray(ans);
        return ans;
    }
}
// @lc code=end

