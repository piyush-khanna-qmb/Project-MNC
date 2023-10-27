import java.util.*;

public class Solution 
{
    private static void findLefts(TreeNode root, List<Integer> ans)
    {
        if(root.left==null && root.right==null)
            return;
        ans.add(root.data);
        
        if(root.left!=null)
        {
            findLefts(root.left, ans);
        }
        else
        {
            findLefts(root.right, ans);
        }
    }

    private static void leaves(TreeNode root, List<Integer> ans)
    {
        if(root==null)
            return;
        if(root.left==null && root.right==null)
            ans.add(root.data);
        leaves(root.left, ans);
        leaves(root.right, ans);
    }

    private static void addRights(TreeNode root, List<Integer> ds)
    {
        if(root.left==null && root.right==null)
            return;
        ds.add(root.data);
        if(root.right!=null) {
            addRights(root.right, ds);
        }
        else {
            addRights(root.left, ds);
        }
    }

    public static List<Integer> traverseBoundary(TreeNode root)
    {
        if(root==null)
            return new ArrayList();
        List<Integer> ans= new ArrayList();
        ans.add(root.data);
        if(root.left!=null)
            findLefts(root.left, ans);
        leaves(root, ans);
        if(root.right!=null)
        {
            List<Integer> ds= new ArrayList();
            addRights(root.right, ds);
            for(int i= ds.size()-1; i>=0; i--)
                ans.add(ds.get(i));
        }        
        return ans;
    }
}