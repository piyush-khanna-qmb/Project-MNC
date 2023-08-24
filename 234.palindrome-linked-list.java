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
    public boolean isPalindrome(ListNode head) 
    {
        if(head==null)
            return true;
        
        ListNode temp= head;
        int sum= 0, tt, rev= 0;
        while(temp!=null)
        {
            sum= sum*10+temp.val;
            temp= temp.next;
        }
        tt= sum;
        while(tt!=0)
        {
            rev= rev*10 + tt%10;
            tt/= 10;
        }
        return sum == rev;
    }
}
// @lc code=end

