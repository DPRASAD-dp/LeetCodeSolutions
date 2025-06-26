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
    public ListNode oddEvenList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode evenDummy = new ListNode(0);
        ListNode oddDummy = new ListNode(0);
        ListNode even = evenDummy, odd = oddDummy;
        ListNode temp = head;
        int i = 1;
        while(temp!= null){
            System.out.println("forming list");
            if(i%2 ==0){
                even.next =temp;
                even = even.next;
            }else{
                odd.next = temp;
                odd = odd.next;
            }
            i++;
            temp = temp.next;
        }
        even.next = null;
        odd.next = evenDummy.next;
        System.out.println("campleted forming");
        return oddDummy.next;

    }
}