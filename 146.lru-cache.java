/*
 * @lc app=leetcode id=146 lang=java
 *
 * [146] LRU Cache
 */

// @lc code=start
class LRUCache
{
    Map<Integer, Integer> lhm;
    
    public LRUCache(int capacity) 
    {
        lhm= new LinkedHashMap<>(capacity, 1.1f, true) {

            public boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        }   ; 
    }
    
    public int get(int key) 
    {
        return lhm.getOrDefault(key, -1);
    }

    public void put(int key, int value) 
    {
        lhm.put(key, value);
    }
}

// @lc code=end

