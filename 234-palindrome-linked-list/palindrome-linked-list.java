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
    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null){
            return true;
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode f = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode ans = reverseLinkedList(slow);


        while(ans !=null){
            if(f.val != ans.val){
                return false;
            }
            f = f.next;
            ans = ans.next;
        }

        return true;
        
        
    }
    public ListNode reverseLinkedList(ListNode c){

        ListNode prev = null;
        ListNode now = c;
        while(now!= null){
            ListNode future= now.next;
            now.next = prev;
            prev = now;
            now = future;
        }
        return prev;


    }
}