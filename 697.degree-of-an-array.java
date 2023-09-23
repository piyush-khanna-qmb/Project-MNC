class Solution 
{
    private static class Jumba
    {
        int key, value, st, end;
        Jumba(int k, int v)
        {
            key = k;
            value = v;
        }
    }
    
    private int findDegree(HashMap<Integer, Jumba> hm, int nums[])
    {
        int h = 1;
        for(int i = 0; i < nums.length; i++)
        {
            int n = nums[i];
            if(hm.get(n) != null)
            {
                Jumba j = hm.get(n);
                j.value = j.value + 1;
                if(h < j.value)
                    h = j.value;
                j.end = i;
            }
            else
            {
                Jumba j = new Jumba(n, 1);
                j.st = i;
                j.end = i;
                hm.put(n, j);
            }
        }
        return h;
    }

    public int findShortestSubArray(int[] nums) 
    {
        HashMap<Integer, Jumba> hm = new HashMap();
        int deg = findDegree(hm, nums);
        int shortest = nums.length;
        for(int i = 0; i < nums.length; i++)
        {
            Jumba j = hm.get(nums[i]);
            if(j.value == deg)
                shortest = Math.min(shortest, j.end - j.st + 1);
        }
        return shortest;
    }
}