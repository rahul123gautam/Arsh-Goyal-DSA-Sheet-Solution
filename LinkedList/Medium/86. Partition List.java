Problem Link:- https://leetcode.com/problems/partition-list/


             ******************CODE******************
             
class Solution {
    public ListNode partition(ListNode head, int x) {
       if (head == null || head.next == null)
            return head;
        ListNode left = null, leftTail = null, right = null, rightTail = null;
        ListNode node = head;
        while (node != null) {
            if (node.val < x) {
                if (left == null) {
                    left = new ListNode(node.val);
                    leftTail = left;
                }
                else {
                    leftTail.next = new ListNode(node.val);
                    leftTail = leftTail.next;
                }
            }
            else {
                if (right == null) {
                    right = new ListNode(node.val);
                    rightTail = right;
                }
                else {
                    rightTail.next = new ListNode(node.val);
                    rightTail = rightTail.next;
                }
            }
            node = node.next;
        }
        if (leftTail != null)
            leftTail.next = right;
        return (left == null) ? right : left;
        //return leftTail;
    }
}
