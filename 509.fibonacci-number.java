/*
 * @lc app=leetcode id=509 lang=java
 *
 * [509] Fibonacci Number
 */

// @lc code=start
class Solution 
{
    public int fib(int n) 
    {
        if(n==0)    
            return 0;
        int a=0, i= 1, b=1, c;
        do {
            c= a+b;
            a=b;
            b=c;
            i++;
        } while(i<n);
        return c;
    }
}
// @lc code=end

