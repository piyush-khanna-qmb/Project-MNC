/*
 * @lc app=leetcode id=733 lang=java
 *
 * [733] Flood Fill
 */

// @lc code=start
class Solution 
{
    private void bharde(int image[][], int sr, int sc, int iniColor, int newcolor)
    {
        int m= image.length, n= image[0].length;
        image[sr][sc]= newcolor;
        if(sr>0 && image[sr-1][sc] == iniColor) {
            bharde(image, sr-1, sc, iniColor, newcolor);
        }
        if(sr<m-1 && image[sr+1][sc] == iniColor) {
            bharde(image, sr+1, sc, iniColor, newcolor);
        }
        if(sc>0 && image[sr][sc-1] == iniColor) {
            bharde(image, sr, sc-1, iniColor, newcolor);
        }
        if(sc<n-1 && image[sr][sc+1] == iniColor) {
            bharde(image, sr, sc+1, iniColor, newcolor);
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) 
    {
        if(image[sr][sc] == color) {
            System.out.println("Same shit");
            return image;
        }
        bharde(image, sr, sc, image[sr][sc], color);
        return image;
    }
}
// @lc code=end