class Solution 
{
    public int maxProfit(int[] a) 
    {
        int m= Integer.MAX_VALUE, pro, n= a.length, grPro= 0;
        for(int= 0; i<n; i++)
        {
            if(a[i] > m)
                m= a[i];
            
            pro= a[i]-m;
            if(pro>grPro)
                grPro= pro;
        }
        return pro;
    }
}