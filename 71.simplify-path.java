/*
 * @lc app=leetcode id=71 lang=java
 *
 * [71] Simplify Path
 */

// @lc code=start
class Solution 
{
    public String simplifyPath(String path) 
    {
        // remove initial slashes
        String dirs[]= path.split("/+");

        Deque<String> st= new ArrayDeque();
        for(String folder: dirs)
        {
            if(folder.equals(".."))
            {
                if(!st.isEmpty())
                    st.removeLast();
            }
            else if(!folder.equals("."))
                st.addLast(folder);
        }

        // Path creation
        StringBuilder res;
        for(String ss: st)
            res.append(ss+"/");
        
        res.deleteCharAt(res.length()-1);
        res.insert(0, '/');
        return res.toString();
    }
}
// @lc code=end

