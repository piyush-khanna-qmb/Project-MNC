/*
 * @lc app=leetcode id=1578 lang=java
 *
 * [1578] Minimum Time to Make Rope Colorful
 */

// @lc code=start
class Solution 
{
    public int minCost(String colors, int[] neededTime) 
    {
        if(colors.length() == 1)
            return 0;
        char st[]= colors.toCharArray();
        int i= 0, j= 1;
        int N= 0;

        while(j<colors.length()) {
            if(st[i] == st[j]) {
                if(neededTime[i] <= neededTime[j]) {
                    i++;
                    j++;
                    N+= neededTime[i]; 
                }
                else {
                    j++;
                    N+= neededTime[j];
                }
            }
            else {
                j++;
                i= j-1;
            }
        }

        return N;
    }
}
// @lc code=end

