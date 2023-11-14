class inorderSuccessorInBST
{
    public find(tn root, tn p)
    {
        tn tmp= root;
        tn gr= null;
        while(tmp != null)
        {
            if(tmp.val > p.val)
            {
                gr= tmp;
                tmp= tmp.left;
            }
            else if(temp.val < p.val)
            {
                tmp= tmp.right;
            }
        }
        return gr;
    }
}