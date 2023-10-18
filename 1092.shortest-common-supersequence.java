/*
 * @lc app=leetcode id=1092 lang=java
 *
 * [1092] Shortest Common Supersequence 
 */

// @lc code=start
class Solution 
{
    private String f(String s, String t)
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
                    dp[i][j]= Math.max(dp[i][j-1] , dp[i-1][j]);
            }
        }
        int i= m, j= n;
        StringBuilder sb= new StringBuilder();
        while(i>0 && j>0)
        {
            if(s.charAt(i-1) == t.charAt(j-1))
            {
                sb.append(s.charAt(i-1));
                i--; j--;
            }
            else
            {
                if(dp[i][j-1] >= dp[i-1][j])
                {
                    sb.append(t.charAt(j-1));
                    j--;
                }
                else
                {
                    sb.append(s.charAt(i-1));
                    i--;
                }
            }
        }
        while(i>0)
        {
            sb.append(s.charAt(i-1));
            i--;
        }
        while(j>0)
        {
            sb.append(t.charAt(j-1));
            j--;
        }
        return sb.reverse().toString();
    }
    public String shortestCommonSupersequence(String str1, String str2) 
    {
        return f(str1, str2);
    }
}
// @lc code=end

