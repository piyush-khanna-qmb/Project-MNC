/*
 * @lc app=leetcode id=234 lang=java
 *
 * [234] Palindrome Linked List
 */

// @lc code=start
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution 
{
    public boolean isPalin(char c[])
    {
        for(int i=0; i<c.length/2; i++)
            if(c[i]!=c[c.length-1-i])
                return false;
        return true;
    }
    public boolean isPalindrome(ListNode head) 
    {
        StringBuilder sb= new StringBuilder();
        ListNode temp= head;
        while(temp!=null)
        {
            sb.append(temp.val);
            temp= temp.next;
        }
        return isPalin(new String(sb).toCharArray());
    }
}
// @lc code=end

