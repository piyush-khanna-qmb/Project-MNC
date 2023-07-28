/*
 * @lc app=leetcode id=1249 lang=java
 *
 * [1249] Minimum Remove to Make Valid Parentheses
 */

// @lc code=start
class Solution 
{
    public String minRemoveToMakeValid(String s) 
    {
        StringBuilder sb= new StringBuilder(s);
        Stack<Integer> sexyMotherfuckerStack= new Stack<>();
        int n= s.length();
        char c;
        for(int i=0; i<n; i++)
        {
            c= s.charAt(i);
            if(c== '(')
                sexyMotherfuckerStack.push(i);
            else if(c == ')')
            {
                if(sexyMotherfuckerStack.isEmpty())
                    sb.setCharAt(i, '^');
                else
                {
                    sexyMotherfuckerStack.pop();
                }
            }
        }
        while(!sexyMotherfuckerStack.isEmpty())
            sb.setCharAt(sexyMotherfuckerStack.pop(), '^');
        
        StringBuilder res= new StringBuilder();
        for(int i=0; i<n; i++)
        {
            c= sb.charAt(i);
            if(c!='^')
                res.append(c);
        }
        return res.toString();
    }
}
// @lc code=end

