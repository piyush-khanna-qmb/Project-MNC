/*
 * @lc app=leetcode id=151 lang=java
 *
 * [151] Reverse Words in a String
 */

// @lc code=start
class Solution 
{
    private String removeBullshit(String s)
    {
        StringBuilder sb= new StringBuilder();
        int i=0;
        for(; i<s.length()-1; i++)
        {
            if (!(s.charAt(i)==' ' && s.charAt(i+1)==' '))
                sb.append(s.charAt(i));
        }
        sb.append(s.charAt(i));
        return new String(sb);
    }

    public String reverseWords(String s) 
    {
        String tmp= "", res= "";
        char ch;
        s= s.trim();
        if(s.length() <= 1)
            return s;

        s= removeBullshit(s)+" ";

        for(int i=0; i<s.length(); i++)
        {
            ch= s.charAt(i);
            if(ch != ' ')
                tmp=tmp+ch;
            else
            {
                res= tmp+" "+res;
                tmp= "";
            }
        }
        return res.trim();
    }
}
// @lc code=end

