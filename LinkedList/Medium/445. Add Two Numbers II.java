Problem Link:- https://leetcode.com/problems/add-two-numbers-ii/


              *******************CODE*****************
              
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer>st1 = new Stack<>();
        Stack<Integer>st2 = new Stack<>();
        while(l1 != null || l2 != null){
            if(l1 != null){
                st1.push(l1.val);
                l1 = l1.next;
            }
            if(l2 != null){
                st2.push(l2.val);
                l2 = l2.next;
            }
        }
        int carry = 0;
        ListNode travers = null;
        while(!st1.isEmpty() || !st2.isEmpty() || carry > 0){
            int sum = 0;
            if(!st1.isEmpty()) sum += st1.pop();
            if(!st2.isEmpty()) sum += st2.pop();
            sum += carry;
            ListNode temp = new ListNode(sum%10);
            temp.next = travers;
            travers = temp;
            carry = sum/10;
        }
        return travers;
    }
}
