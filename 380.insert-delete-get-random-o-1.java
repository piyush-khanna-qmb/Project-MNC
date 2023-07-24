/*
 * @lc app=leetcode id=380 lang=java
 *
 * [380] Insert Delete GetRandom O(1)
 */

// @lc code=start
class RandomizedSet 
{
    boolean param_1, param_2;
    int param_3, lastAdded;
    HashSet<Integer> hs= new HashSet<>();
    Random rand;
    public RandomizedSet() 
    {
        param_1= param_2= false;
        param_3= 0;
        rand= new Random();
    }
    
    public boolean insert(int val) 
    {
        lastAdded= val;
        return hs.add(val);
    }
    
    public boolean remove(int val) 
    {
        return hs.remove(val);
    }
    
    public int getRandom() 
    {
        Iterator<Integer> i= hs.iterator();
        int rInt= rand.nextInt(hs.size()), res= lastAdded;
        while(i.hasNext() && rInt>=0)
        {
            res= i.next();
            rInt--;
        }
        return res;
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
// @lc code=end

