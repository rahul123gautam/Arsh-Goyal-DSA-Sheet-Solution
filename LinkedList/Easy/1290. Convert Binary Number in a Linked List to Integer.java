Problem Lin:- https://leetcode.com/problems/convert-binary-number-in-a-linked-list-to-integer/


                ***********************CODE*************************
                
                  
                  
class Solution {
    public int getDecimalValue(ListNode head) {
        String s = "";
        while(head.next != null){
            int val = head.val;
            s += val;
            head = head.next;
        }
        s = s + head.val;
        int decimal=Integer.parseInt(s,2);  
        return decimal;
    }
}
