/*
 * @lc app=leetcode id=415 lang=java
 *
 * [415] Add Strings
 */

// @lc code=start
class Solution 
{
    public String addStrings(String num1, String num2) 
    {
        if(num1.equals("0"))
            return num2;
        else if (num2.equals("0"))
            return num2;

        int car=0, a= num1.length(), b= num2.length(), padding;
        String ans="";
        if(a>b) // padding
        {
            padding= a-b;
            for(int i=0; i<padding; i++)
                num2= "0"+num2;
        }
        else 
        {
            padding= b-a;
            for(int i=0; i<padding; i++)
                num1= "0"+num1;
        }
        int ca, cb, res;
        for(int i=a+padding-1; i>=0; i--)
        {
            ca= num1.charAt(i)-'0';
            cb= num2.charAt(i)-'0';
            res= ca+cb+car;
            car= res/10;
            res= res%10;
            ans= Integer.toString(res)+ ans;
        }
        if(car>0)
            ans= Integer.toString(car)+ans;
        
        return ans;
    }
}
// @lc code=end

