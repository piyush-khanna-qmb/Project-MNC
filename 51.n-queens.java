/*
 * @lc app=leetcode id=51 lang=java
 *
 * [51] N-Queens
 */

// @lc code=start
class Solution 
{
    private boolean chaklaPeBithaSakteHain(int bitches[], int r, int c)
    {
        for (int i = 0; i < c; i++) 
        {
            if (bitches[i] == r || bitches[i] - i == r - c || bitches[i] + i == c + r) 
            {
                return false;
            }
        }
        return true;
    }

    private void setBitches(List<List<String>> ans, int bitches[], int c, int n)
    {
        if(c == n)
        {
            List<String> ds= new ArrayList();
            for(int i= 0; i<n; i++)
            {
                char ch[]= new char[n];
                for(int j=0; j<n; j++)
                {
                    if(j == bitches[i])
                        ch[j]= 'Q';
                    else
                        ch[j]= '.';
                }
                ds.add(new String(ch));
            }
            ans.add(ds);
        }

        for(int i= 0; i<n; i++)
        {
            if(chaklaPeBithaSakteHain(bitches, i, c))
            {
                bitches[c]= i;
                setBitches(ans, bitches, c+1, n);
            }
        }
    }

    public List<List<String>> solveNQueens(int n) 
    {        
        int bitches[]= new int[n];
        List<List<String>> ans= new ArrayList();
        setBitches(ans, bitches, 0, n);
        return ans;
    }
}
// @lc code=end

