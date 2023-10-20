/*
 * @lc app=leetcode id=72 lang=java
 *
 * [72] Edit Distance
 */

// @lc code=start
class Solution 
{
    private int f(int i, int j, char s[], char t[], int dp[][])
    {
        if(i==0)
            return j;
        if(j==0)
            return i;

        if(dp[i][j] != -1)
            return dp[i][j];
        
        if(s[i-1] == t[j-1])
            return dp[i][j]= f(i-1, j-1, s, t, dp);
        else
        {
            //insert
            int ins= 1 + f(i, j-1, s, t, dp);
            int rep= 1 + f(i-1, j-1, s, t, dp);
            int del= 1 + f(i-1, j, s, t, dp);
            return dp[i][j]= Math.min(Math.min(ins, rep), del);
        }
    }
    public int minDistance(String word1, String word2) 
    {
        int dp[][]= new int[word1.length()+1][word2.length()+1];
        for(int r[]: dp)    
            Arrays.fill(r, -1);
        
        return f(word1.length(), word2.length(), word1.toCharArray(), word2.toCharArray(), dp);
    }
}
// @lc code=end

