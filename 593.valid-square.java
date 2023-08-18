/*
 * @lc app=leetcode id=593 lang=java
 *
 * [593] Valid Square
 */

// @lc code=start
class Solution 
{
    private int diss(int p1[], int p2[])
    {
        return Math.pow((p2[1]-p1[1]), 2) + Math.pow((p2[0]-p1[0]), 2);
    }

    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) 
    {
        int ds[]= new int[6];
        ds[0]= diss(p1,p2);
        ds[1]= diss(p1,p3);
        ds[2]= diss(p1,p4);
        ds[3]= diss(p2,p3);
        ds[4]= diss(p2,p4);
        ds[5]= diss(p3,p4);

        Arrays.sort(ds);

        return ds[0]>0 && ds[0]==ds[1] && ds[1]==ds[2] && ds[2]==ds[3] && ds[4]==ds[5] && ds[0]*2 == ds[4];
    }
}
// @lc code=end

