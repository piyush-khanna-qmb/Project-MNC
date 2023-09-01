/*
 * @lc app=leetcode id=621 lang=java
 *
 * [621] Task Scheduler
 */

// @lc code=start
class Solution 
{
    public int leastInterval(char[] tasks, int n) 
    {
        int chars[] = new int[26];
        for(char task: tasks)
            chars[task-'A']+= 1;
        
        int maxWala= 0;
        for(int i: chars)
            maxWala= Math.max(maxWala, i);
        
        int tasksWithMax= 0;
        for(int i: chars)
            if(i == maxWala)    tasksWithMax++;

        return Math.max(tasks.length , (maxWala-1)*(n+1)+tasksWithMax);
    }
}
// @lc code=end

