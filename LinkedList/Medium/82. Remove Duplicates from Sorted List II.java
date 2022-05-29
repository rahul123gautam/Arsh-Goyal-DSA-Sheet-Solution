Problem Link:- https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/


                ************************CODE*************************
                
                  
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode node = new ListNode(0, head);
        ListNode prev = node;
       while(head != null) {
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                prev.next = head.next;
            }
            else{
                prev = prev.next;
            }
            head = head.next;
        }
        return node.next;
    }
}
