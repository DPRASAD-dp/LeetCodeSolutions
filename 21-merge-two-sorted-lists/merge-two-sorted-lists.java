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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(0);
        ListNode dummy = ans;
        ListNode head1 = list1;
        ListNode head2 = list2;
        while(head1 != null && head2 != null){
            if(head1.val < head2.val){
                ans.next = new ListNode(head1.val);
                ans = ans.next;
                head1 = head1.next;
            }
            else{
                ans.next = new ListNode(head2.val);
                ans = ans.next;
                head2 = head2.next;

            }
        }

        if(head1 == null){
            while(head2 != null){
                ans.next= new ListNode(head2.val);
                ans = ans.next;
                head2 = head2.next;
            }
        }
        if(head2 == null){
            while(head1 != null){
                ans.next = new ListNode(head1.val);
                ans = ans.next;
                head1 = head1.next;
            }
        }
        return dummy.next;
        
    }
}