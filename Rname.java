import java.util.*;
class RName
{
    static int fun(int i, int arr[], ArrayList<Integer> ls, int ksum)
    {
        if(i == arr.length) {
            int sum= 0;
            for(int s: ls)
                sum+= s;
            if(sum==ksum) 
                return 1;
            return 0;
        }
        ls.add(arr[i]);
        int addKrke= fun(i+1, arr, ls, ksum);
        ls.remove(Integer.valueOf(arr[i]));
        int binaAddKrke= fun(i+1, arr, ls, ksum);
        return addKrke+binaAddKrke;
    }
    public static void main(String args[])
    {
        int arr[]= {2,1,2,1}; 
        ArrayList<Integer> ls= new ArrayList();
        System.out.println(fun(0, arr, ls, 3));
    }
}