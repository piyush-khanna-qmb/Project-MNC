import java.util.*;
class RName
{
    static int fun(int i, int arr[], int s, int ksum)
    {
        if (i == arr.length) {
            if(s==ksum) {
                return 1;
            }
            return 0;
        }
        s+= arr[i];
        int left= fun(i+1, arr, s, ksum);
        s-= arr[i];
        int right= fun(i+1, arr, s, ksum);

        return left+right;
    }
    public static void main(String args[])
    {
        int arr[]= {2,1,2,1}; 
        System.out.println(fun(0, arr, 0, 3));
    }
}