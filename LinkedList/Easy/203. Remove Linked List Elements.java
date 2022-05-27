Problem Link:- https://leetcode.com/problems/remove-linked-list-elements/


class Solution {
    public ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val==val)
               head=head.next;
        ListNode newHead = head;
        while(head!=null && head.next!=null){
              if(head.next.val==val)
              head.next=head.next.next;
              else
                  head=head.next;
        }
        return newHead;
    }
}
