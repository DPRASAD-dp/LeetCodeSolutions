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
class Solution {
    public void reorderList(ListNode head) {

        ListNode middle = findMiddle(head);
        ListNode temp = head;

        ListNode rev = reversetheLinked(middle);
        while(temp.next!= null && rev.next!= null){
            ListNode s = temp.next;
            ListNode f = rev.next;
            temp.next = rev;
            rev.next = s;
            temp = s;
            rev = f;


        }

    }

    public ListNode findMiddle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next!= null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode reversetheLinked(ListNode head){
        ListNode now = head;
        ListNode prev = null;
        while(now!=null){
            ListNode future = now.next;
            now.next = prev;
            prev = now;
            now = future;
        }
        return prev;
    }
    
}