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
    public ListNode reverseBetween(ListNode head, int left, int right) {
  if (head == null || head.next == null) {
            return head;
        }

        int r = right - left + 1;
        ListNode dummy = new ListNode(0); 
        dummy.next = head;
        ListNode a = dummy; 

        for (int i = 0; i < left - 1; i++) {
            a = a.next;
        }

        ListNode past = null;
        ListNode now = a.next;
        ListNode tail = now; 

        while (r > 0 && now != null) {
            ListNode future = now.next; 
            now.next = past;
            past = now;
            now = future;
            r--;
        }

        a.next = past; 
        tail.next = now;

        return dummy.next; 
    }
}