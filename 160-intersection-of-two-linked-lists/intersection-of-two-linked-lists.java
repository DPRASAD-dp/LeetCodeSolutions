/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while(temp1 != null && temp2 != null){
             temp1 = temp1.next;
             temp2 = temp2.next;
        }
        int count = 0;
        int p1 = 0;
        int p2 = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            p1 =1;
            count++;
        }
        while(temp2 != null){
            temp2 = temp2.next;
            p2 = 1;
            count++;
        }

        temp1 = headA;
        temp2 = headB;

        if(p1 == 1){
            while(count!=0){
                temp1 = temp1.next;
                count--;
            }
        }
        else if(p2 ==1){
            while(count!=0){
                temp2 = temp2.next;
                count--;
            }
        }

        while(temp1 != null && temp2 != null){
            if(temp1 == temp2){
                return temp1;
            }
             temp1 = temp1.next;
             temp2 = temp2.next;
        }

        return null;


    }
}