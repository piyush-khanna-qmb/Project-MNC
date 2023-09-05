import java.util.*;
class mergeSort
{
    private static void merge(int arr[], int low, int mid, int high)
    {
        int tmp[]= new int[high-low+1];
        int k= 0, i= low, j= mid+1;
        while(i<=mid && j<=high) 
        {
            if(arr[i]<=arr[j])
                tmp[k++]= arr[i++];
            else
                tmp[k++]= arr[j++];
        }
        while(i<=mid)
            tmp[k++]= arr[i++];
        while(j<=high)
            tmp[k++]= arr[j++];
        
        for(k=low; k<=high; k++)
            arr[k]= tmp[k-low];
    }
    private static void mS(int arr[], int low, int high)
    {
        if(low >= high)
            return;
        int mid= (low+high)/2;
        mS(arr, low, mid);
        mS(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void main(String args[])
    {
        int a[]= {12,45,78,9,4,2,65,8,23,1,7,97,2};
        mS(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}