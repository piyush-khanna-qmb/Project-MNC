/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

// @lc code=start
class LRUCache
{
    public static class Node
    {
        int key, value;
        Node(int k, int v)
        {
            key= k;
            value= v;
        }
    }
    HashMap<Integer, Integer> hm= new HashMap();
    Queue<Node> minHeap= new PriorityQueue<Node>(
        (a,b) -> (a.value-b.value)
    );
    int total;
    public LRUCache(int capacity) 
    {
        total= capacity;
    }
    
    public int get(int key) 
    {
        return hm.getOrDefault(key);
    }
    
    public void put(int key, int value) 
    {
        if(hm.size() > total)
        {
            int toBeRemovedKey= minHeap.poll().key;
            hm.remove(toBeRemovedKey);
        }
        hm.put(key, value);
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */
// @lc code=end

