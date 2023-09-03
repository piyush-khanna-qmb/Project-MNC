import java.util.*;
class RName
{
    static void fun(int i, int arr[], ArrayList<Integer> ls, int ksum)
    {
        if(i>=arr.length) {
            int sum= 0;
            for(int ii: ls)
                sum+= ii;
            if(sum == ksum) {
                System.out.println(ls.toString());
            }
            return;
        }
        fun(i+1, arr, ls, ksum);
        ls.add(arr[i]);
        fun(i+1, arr, ls, ksum);
        ls.remove(Integer.valueOf(arr[i]));
    }
    public static void main(String args[])
    {
        int arr[]= {2,1,2,1}; 
        ArrayList<Integer> ls= new ArrayList();
        fun(0, arr, ls, 3);
    }
}