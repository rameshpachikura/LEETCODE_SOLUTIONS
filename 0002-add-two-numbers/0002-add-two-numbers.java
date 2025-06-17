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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        int carry = 0;
        int val = 0;

        ListNode header = l3;

        while(l1!=null || l2!=null || carry!=0)
        {
            int val1 = 0;
            int val2 = 0;

            if(l1 != null)
            {
                val1 = l1.val;
                l1 = l1.next;
            }

            if(l2!=null)
            {
                val2 = l2.val;
                l2 = l2.next;
            }

            val = val1+val2+carry;

            carry = 0;

            if(val > 9)
            {
                carry = 1;
                val = val-10;
            }

            l3.val = val;

            if(l1!=null || l2!=null || carry!=0)
            {
                ListNode temp = new ListNode();
                l3.next = temp;
                l3 = temp;
            }
        }

        return header;
    }
}