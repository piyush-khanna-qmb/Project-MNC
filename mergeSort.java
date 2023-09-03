import java.util.*;
class mergeSort
{
    private static void mergeBitches(int arr[], int low, int mid, int high)
    {
        int tmp[]= new int[high-low+1];
        int left= low, right= mid+1, k= 0;

        while(left<=mid && right<=high) 
        {
            if(arr[left] <= arr[right])
                tmp[k++]= arr[left++];
            else
                tmp[k++]= arr[right++];
        }

        while(left<=mid)
            tmp[k++]= arr[left++];
        while(right<=high)
            tmp[k++]= arr[right++];
        
        for(int i= low; i<=high; i++)
            arr[i]= tmp[i-low];
    }

    private static void mS(int arr[], int low, int high)
    {
        if(low >= high)
            return;
        
        int mid= (low+high)/2;
        mS(arr, low, mid);
        mS(arr, mid+1, high);
        mergeBitches(arr, low, mid, high);
    }

    public static void main(String args[]) 
    {
        int arr[]= {12,4,6,8,2,54,1,5,7,89};
        mS(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}