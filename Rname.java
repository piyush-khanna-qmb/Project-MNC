import java.util.*;
class RName
{
    static void fun(int i, int arr[], ArrayList<Integer> ls)
    {
        if(i>=arr.length)
        {
            System.out.println(ls.toString());
            return;
        }
        ls.add(arr[i]);
        fun(i+1, arr, ls);
        ls.remove(Integer.valueOf(arr[i]));
        fun(i+1, arr, ls);
    }
    public static void main(String args[])
    {
        int arr[]= {3,1,2}; 
        ArrayList<Integer> ls= new ArrayList();
        fun(0, arr, ls);
    }
}