/*
 * @lc app=leetcode id=1143 lang=java
 *
 * [1143] Longest Common Subsequence
 */

// @lc code=start
class Solution 
{
    public int longestCommonSubsequence(String text1, String text2) 
    {
        int m= text1.length();
        int n= text2.length();
        int dp[][]= new int[m+1][n+1];

        char t1[]= text1.toCharArray();
        char t2[]= text2.toCharArray();
        
        for(int i= 0; i<=m; i++)
        {
            for(int j= 0; j<=n; j++)
            {
                if(i==0 || j==0)
                    dp[i][j]= 0;
                
                else if(t1[i-1] == t2[j-1])
                    dp[i][j]= 1 + dp[i-1][j-1];
                else
                    dp[i][j]= Math.max(dp[i-1][j], dp[i][j-1]);
            }
        }

        return dp[m][n];
    }
}
// @lc code=end