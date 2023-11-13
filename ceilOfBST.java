import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T>
    {
       public:
        T data;
        TreeNode<T> left;
        TreeNode<T> right;

        TreeNode(T data)
        {
            this.data = data;
            left = null;
            right = null;
        }
    };

************************************************************/

public class Solution 
{
    public static int findCeil(TreeNode<Integer> node, int x) 
    {
        if(node == null || node.data<x)
            return -1;
        TreeNode<Integer> temp= node;
        int gr= node.data;
        while(temp != null)
        {
            if(temp.data < x)
            {
                temp= temp.right;
            }
            if(temp.data > x)
            {
                gr= temp.data;
                temp= temp.left;
            }
            else
            {
                gr= x;
                break;
            }
        }
        return gr;
    }
}
