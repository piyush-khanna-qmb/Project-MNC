/*
 * @lc app=leetcode id=12 lang=java
 *
 * [12] Integer to Roman
 */

// @lc code=start
class Solution 
{
    public String intToRoman(int num) 
    {
        String roms[]= {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        int nums[]= {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};

        StringBuilder sb= new StringBuilder();
        int i= nums.length()-1;

        while(num>0)
        {
            if(num > nums[i])
                sb.append(roms[i])
            else
                i--;
        }
        return new String(sb);
    }
}
// @lc code=end

