/*
 * @lc app=leetcode id=706 lang=java
 *
 * [706] Design HashMap
 */

// @lc code=start
class MyHashMap 
{
    LinkedList<Pair>[] buckets;
    int B_SIZE= 10001;

    private int hash(int key)
    {
        return key % B_SIZE;
    }

    public MyHashMap() 
    {
        buckets= new LinkedList[B_SIZE];
        for(int i=0; i<B_SIZE; i++)
            buckets[i]= new LinkedList();
    }
    
    public void put(int key, int value) 
    {               
        int nn= hash(key);
        Pair np= new Pair(key, value);
        if(buckets[nn].isEmpty())
            buckets[nn].add(np);
        else
        {
            for(Pair p: buckets[nn])
            {
                if(p.key == key)
                {
                    p.value= value;
                    return;
                }
            }
            buckets[nn].add(np);
        }
    }
    
    public int get(int key) 
    {
        int nn= hash(key);
        if(buckets[nn].isEmpty())
            return -1;

        for(Pair p: buckets[nn])
        {
            if(p.key == key)
                return p.value;
        }
        return -1;
        
    }
    
    public void remove(int key) 
    {
        int nn= hash(key);
        if(buckets[nn].isEmpty())
            return;

        for(Pair p: buckets[nn])
        {
            if(p.key == key)
            {
                buckets[nn].remove(p);
                return;
            }
        }
    }

    private static class Pair
    {
        int key;
        int value;

        Pair(int k, int v)
        {
            key= k;
            value= v;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
// @lc code=end

