/*
 * @lc app=leetcode id=134 lang=java
 *
 * [134] Gas Station
 */

// @lc code=start
class Solution 
{
    public int canCompleteCircuit(int[] gas, int[] cost) 
    {
        int totGas= 0;
        int totCost= 0;
        int startInd= 0;
        int currGas= 0;

        for(int i=0; i<gas.length; i++) {
            totGas+= gas[i];
            totCost+= cost[i];
            currGas+= gas[i]-cost[i];
            
            if(currGas < 0) {
                startInd= i+1;
                currGas= 0;
            }
        }

        if(totGas < totCost)    return -1;
        return startInd;
    }
}
// @lc code=end

