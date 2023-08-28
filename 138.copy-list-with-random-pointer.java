/*
 * @lc app=leetcode id=138 lang=java
 *
 * [138] Copy List with Random Pointer
 */

// @lc code=start
/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution 
{
    public Node copyRandomList(Node head) 
    {
        if(head == null)
            return null;
        // Add intermediate bitches
        Node temp= head;
        while(temp!=null)
        {
            Node nigga= new Node(temp.val);
            nigga.next= temp.next;
            temp.next= nigga;
            temp= nigga.next;
        }

        // Add pointers
        temp= head;
        while(temp!=null       )
        {
            if(temp.random!=null)
            {
                temp.next.random= temp.random.next;
            }
            temp= temp.next.next;
        }

        // Disengage
        Node nHead= head.next; 
        temp= head;
        while(temp!=null)
        {
            Node agla= temp.next;
            temp.next= agla.next;
            if(temp.next!=null)
                agla.next= temp.next.next;
            temp=temp.next;  
        }
        return nHead;
    }
}
// @lc code=end