/*
 * @lc app=leetcode id=22 lang=java
 *
 * [22] Generate Parentheses
 */

// @lc code=start
class Solution 
{
    private boolean isValid(String s)
    {
        Stack<Character> stack= new Stack();
        for(char ch: s.toCharArray())
        {
            if(ch=='(')
                stack.push(ch);
            else
            {
                if(!stack.isEmpty())
                    stack.pop();
            }
        }
        return stack.isEmpty();
    }

    private void permutes(List<String> sab, StringBuilder ds, StringBuilder sb, boolean vis[])
    {
        if(ds.length() == sb.length())
        {
            sab.add(new String(ds));
            return;
        }
        for(int j= 0; j<sb.length(); j++)
        {
            if(vis[j] || (j>0 && sb.charAt(j)==sb.charAt(j-1) && !vis[j-1]))
                continue;

            vis[j]= true;
            ds.append(sb.charAt(j));
            permutes(sab, ds, sb, vis);

            vis[j]= false;
            ds.deleteCharAt(ds.length()-1);
        }
    }

    public List<String> generateParenthesis(int n)
    {
        StringBuilder sb= new StringBuilder();
        for(int i= 0; i<n; i++)
            sb.append("(");
        for(int i= 0; i<n; i++)
            sb.append(")");

        boolean vis[]= new boolean[n*2];
        List<String> sab= new ArrayList();
        permutes(sab, new StringBuilder(), sb, vis);
        List<String> ans= new ArrayList();
        for(String kk: sab)
        {
            if(isValid(kk))
                ans.add(kk);
        }
        return ans;
    }
}
// @lc code=end

