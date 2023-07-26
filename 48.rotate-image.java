/*
 * @lc app=leetcode id=48 lang=java
 *
 * [48] Rotate Image
 */

// @lc code=start
class Solution 
{
    private void revEachRow(int mat[][])
    {
        int tmp, n=mat.length;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n/2; j++)
            {
                tmp= mat[i][j];
                mat[i][j]= mat[i][n-j-1];
                mat[i][n-j-1]= tmp;
            }
        }
    }
    public void rotate(int[][] matrix) 
    {
        int i, j, tmp, n= matrix.length;
        for(i=0; i<n-1; i++)    // Transposition
        {
            for(j=i; j<n; j++)
            {
                if(i!=j)
                {
                    tmp= matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i]= tmp;
                }
            }
        }
        revEachRow(matrix);
    }
}
// @lc code=end

