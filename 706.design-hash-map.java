/*
 * @lc app=leetcode id=706 lang=java
 *
 * [706] Design HashMap
 */

// @lc code=start
class MyHashMap 
{
    List<Integer> keys= new ArrayList();
    List<Integer> values= new ArrayList();
    public MyHashMap() 
    {
        
    }

    public void put(int key, int value) 
    {               
        int inn= keys.indexOf(key);
        if(inn == -1) 
        {
            keys.add(key);
            values.add(value);
        }
        else
            values.set(inn, value);
    }
    
    public int get(int key) 
    {
        int inn= keys.indexOf(key);
        if(inn == -1)
            return -1;
        return values.get(inn);
    }
    
    public void remove(int key) 
    {
        int inn= keys.indexOf(key);
        if(inn != -1)
        {
            keys.remove(inn);
            values.remove(inn);
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

