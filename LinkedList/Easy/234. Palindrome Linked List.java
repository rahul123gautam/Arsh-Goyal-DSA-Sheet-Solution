Problem Link:- https://leetcode.com/problems/palindrome-linked-list/



              *********************CODE***********************
              
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null) return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode current = slow;
        ListNode prev = null;
        while(current != null){
            ListNode temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        while(prev != null && head != null){
            if(prev.val != head.val)return false;
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}
