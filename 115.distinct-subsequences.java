/*
 * @lc app=leetcode id=115 lang=java
 *
 * [115] Distinct Subsequences
 */

// @lc code=start
class Solution 
{
    public int numDistinct(String ss, String tt) 
    {
        char s[]= ss.toCharArray();
        char t[]= tt.toCharArray();
        int m= ss.length(), n= tt.length();
        int dp[][]= new int[m+1][n+1];

        for(int i= 0; i<=m; i++)
            dp[i][0]= 1;
            
        for(int i= 1; i<=m; i++)
        {
            for(int j= 1; j<=n; j++)
            {
                if(s[i-1] == t[j-1])
                {
                    int yahi= dp[i-1][j];
                    int prev= dp[i-1][j-1];
                    dp[i][j]= yahi+prev;
                }
                else
                    dp[i][j]= dp[i-1][j];
            }
        }

        return dp[m][n];
    }
}
// @lc code=end