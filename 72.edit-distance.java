/*
 * @lc app=leetcode id=72 lang=java
 *
 * [72] Edit Distance
 */

// @lc code=start
class Solution 
{
    public int minDistance(String word1, String word2) 
    {
        int m= word1.length(), n= word2.length();
        int dp[][]= new int[m+1][n+1];
        char s[]= word1.toCharArray(), t[]= word2.toCharArray();

        for(int i= 0; i<=m; i++)
        {
            for(int j= 0; j<=n; j++)
            {
                if(i == 0)
                    dp[i][j]= j;
                else if(j == 0)
                    dp[i][j]= i;
                else if(s[i-1] == t[j-1])
                    dp[i][j]= dp[i-1][j-1];
                else
                {
                    int ins= 1 + dp[i][j-1];
                    int rep= 1 + dp[i-1][j-1];
                    int del= 1 + dp[i-1][j];
                    dp[i][j]= Math.min(Math.min(ins, rep), del);
                }
            }
        }
        
        return dp[m][n];
    }
}
// @lc code=end

