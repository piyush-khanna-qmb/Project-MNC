/*
 * @lc app=leetcode id=705 lang=java
 *
 * [705] Design HashSet
 */

// @lc code=start
class MyHashSet 
{
    int B_SIZE;
    boolean arse[];

    public MyHashSet() 
    {
        B_SIZE= (int) Math.pow(10,6);
        arse= new boolean[B_SIZE];
    }
    
    public void add(int key) 
    {
        arse[key]= true;    
    }
    
    public void remove(int key) 
    {
        arse[key]= false;
    }
    
    public boolean contains(int key) 
    {
        return arse[key];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
// @lc code=end

