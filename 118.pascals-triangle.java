/*
 * @lc app=leetcode id=118 lang=java
 *
 * [118] Pascal's Triangle
 */

// @lc code=start
class Solution 
{
    //streak ke liye kya kuchh nahi karna padhta
    int facto(int n)
    {
        if (n==0 || n==1)
            return 1;
        int f= 1;
        for(int i=1; i<=n; i++)
            f*= i;
        return f;
    }
    public ArrayList<Integer> single(int n)
    {
        if(n==0|| n==1)
            return new ArrayList<Integer>(Arrays.asList(1));
        else if(n==2)
            return new ArrayList<Integer>(Arrays.asList(1,1));
        
        List<Integer> mine= new ArrayList<>();
        for(int i=0; i<n; i++)
        {
            mine.add(facto(n-1) / (facto(n-1-i) * facto(i)));
        }
        return mine;
    }
    public List<List<Integer>> generate(int numRows) 
    {
        List<List<Integer>> grMine= new ArrayList<ArrayList<Integer>>();
        for(int i=1; i<numRows; i++)
        {
            grMine.add(single(i));
        }
        return grMine;
    }
}
// @lc code=end

