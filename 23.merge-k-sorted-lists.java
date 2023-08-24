/*
 * @lc app=leetcode id=23 lang=java
 *
 * [23] Merge k Sorted Lists
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
    public ListNode mergeKLists(ListNode[] lists) 
    {
        if(lists.length == 0)
            return null;
        ListNode ansHead= new ListNode(0);
        ListNode ans= ansHead;
        PriorityQueue<ListNode> minHeap= new PriorityQueue<ListNode>(
            (a,b) -> a.val-b.val
        );
        ListNode smallest;
        int n= lists.length;
        for(int i=0; i<n; i++)
        {
            if(lists[i] != null)
                minHeap.offer(lists[i]);
        }

        while(!minHeap.isEmpty())
        {
            smallest= minHeap.poll();
            ans.next= smallest;
            ans= ans.next;
            smallest= smallest.next;
            if(smallest != null)
                minHeap.offer(smallest);
        }
        return ansHead.next;
    }
}
// @lc code=end

