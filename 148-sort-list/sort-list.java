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
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }

        ListNode mid = middleNode(head);
        ListNode right = mid.next;
        mid.next = null;  // Break the list into two parts

        ListNode left = sortList(head);
        right = sortList(right);


        return mergeTwoLists(right,left);
        
    }
     public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1  = list1;
        ListNode head2 = list2;

        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
               current.next = head1;
               current = current.next;
               head1 = head1.next;
               
            }

            else if(head1.val >= head2.val){
               current.next = head2;
               current = current.next;
               head2 = head2.next;
        }}

        while(head1 != null){
            current.next = head1;
            current = current.next;
            head1 = head1.next;
        }

        while(head2 != null){
            current.next = head2;
            current = current.next;
            head2 = head2.next;
        }

        return dummy.next;
        
    }
    public ListNode middleNode(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast != null && fast.next != null) {
            prev = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        return prev;
    }
}