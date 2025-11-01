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
    public ListNode modifiedList(int[] nums, ListNode head) {
       ArrayList<Integer> a=new ArrayList<>();
       int n=nums.length;
       HashSet<Integer> hs=new HashSet<>();
       for(int i=0;i<n;i++){
            hs.add(nums[i]);
       }
       ListNode temp=head;
       while(temp!=null){
            if(!hs.contains(temp.val)){
                a.add(temp.val); 
            }
            temp=temp.next;
       }
       if (a.isEmpty()) return null; 

        ListNode head1 = new ListNode(a.get(0)); 
        ListNode current = head1;
        for (int i = 1; i < a.size(); i++) {
            current.next = new ListNode(a.get(i));
            current = current.next;
        }

        return head1;
    }
}