/*
 * @lc app=leetcode id=583 lang=java
 *
 * [583] Delete Operation for Two Strings
 */

// @lc code=start
class Solution 
{
    private int f(String s, String t)
    {
        int m= s.length(), n= t.length();
        int dp[][]= new int[m+1][n+1];

        for(int i= 1; i<=m; i++)
        {
            for(int j= 1; j<=n; j++)
            {
                if(s.charAt(i-1) == t.charAt(j-1))
                    dp[i][j]= 1 + dp[i-1][j-1];
                else
                    dp[i][j]= Math.max(dp[i-1][j] , dp[i][j-1]);
            }
        }
        return dp[m][n];
    }
    public int minDistance(String word1, String word2) 
    {
        int lcs= f(word1, word2);
        return word1.length()+word2.length()-(2*lcs);
    }
}
// @lc code=end

