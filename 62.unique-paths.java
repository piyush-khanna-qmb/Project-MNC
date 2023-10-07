/*
 * @lc app=leetcode id=62 lang=java
 *
 * [62] Unique Paths
 */

// @lc code=start
class Solution 
{
    public int uniquePaths(int m, int n) 
    {
        int prev[]= new int[n];
        int temp[]= Arrays.copyOf(prev, n);
        temp[0]= 1;
        int up, left;
        for(int i= 0; i<m; i++)
        {
            for(int j= 0; j<n; j++)
            {
                if(i==0 && j==0)
                    continue;
                left= (j>0) ? temp[j-1] : 0;
                up= (i>0) ? prev[j] : 0;
                temp[j]= left+up;
            }
            prev= temp;
        }
        return prev[n-1];
    }
}
// @lc code=end