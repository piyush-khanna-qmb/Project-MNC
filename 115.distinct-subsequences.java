/*
 * @lc app=leetcode id=115 lang=java
 *
 * [115] Distinct Subsequences
 */

// @lc code=start
class Solution 
{
    private int f(int i, int j, char s[], char t[], int dp[][])
    {
        if(j==0)
            return 1;
        if(i==0)
            return 0;
        
        if(dp[i][j] != -1)
            return dp[i][j];

        if(s[i-1] == t[j-1])
        {
            int yahi= f(i-1, j, s, t, dp);
            int prev= f(i-1, j-1, s, t, dp);
            return dp[i][j]= yahi+prev;
        }
        else
            return dp[i][j]= f(i-1, j, s, t, dp);
    }

    public int numDistinct(String s, String t) 
    {
        int m= s.length(), n= t.length();
        int dp[][]= new int[m+1][n+1];
        for(int r[]: dp)
            Arrays.fill(r, -1);

        return f(m, n, s.toCharArray(), t.toCharArray(), dp);
    }
}
// @lc code=end

