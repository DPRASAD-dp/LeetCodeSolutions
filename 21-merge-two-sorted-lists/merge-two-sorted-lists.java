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

import java.util.LinkedList;
class Solution {
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
    
    
}