class Solution 
{
    private void swap(int arr[], int i, int j)
    {
        int tmp= arr[i];
        arr[i]= arr[j];
        arr[j]= tmp;
        return;
    }

    private void ting(List<List<Integer>> ans, List<Integer> ds, int i, int arr[])
    {
        if(i == arr.length-1)
        {
            ans.add(new ArrayList(ds));
            return;
        }

        for(int j= i; j<arr.length; j++)
        {
            swap(arr, i, j)
            ting(ans, ds, i+1, arr);
        }
    }

    public List<List<Integer>> permute(int[] nums) 
    {
        List<List<Integer>> ans= new ArrayList();
        ting(ans, ds, nums);
        return ans;
    }
}

