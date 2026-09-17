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
        if(head==null) return null;
      ListNode odd=new ListNode(0);
      ListNode even=new ListNode(0);
     ListNode otail=odd;
     ListNode etail=even;
     ListNode tail=head;
     boolean oddd=true;
     while(tail!=null){
        if(oddd){
            otail.next=tail;
            oddd=false;
            otail=otail.next;
        }else{
            etail.next=tail;
            etail=etail.next;
            oddd=true;
        }
        tail=tail.next;
     }
     etail.next=null;
     otail.next=even.next;
     return odd.next;
    }
}