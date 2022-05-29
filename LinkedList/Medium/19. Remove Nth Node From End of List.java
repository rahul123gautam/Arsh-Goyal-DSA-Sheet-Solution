Problem Link:- https://leetcode.com/problems/remove-nth-node-from-end-of-list/


                   *********************CODE***********************
                   
                     
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = getSize(head);
        if(size == 1){
            return head.next;
        }
        int index = size - n;
        if(index == 0){
            return head.next;
        }
        deleteNode(index , head , size);
        return head;
        
    }
    public int getSize(ListNode head){
        ListNode temp = head;
        int size = 1;
        while(temp.next != null){
            temp = temp.next;
            size++;
        }
        return size;
    }
    public void deleteNode(int index , ListNode head , int size){
        ListNode prev = getNode(index - 1 , head);
        prev.next = prev.next.next;
    }
    public ListNode getNode(int index , ListNode head){
        ListNode node = head;
        for(int i = 0; i < index ; i++){
            node = node.next;
        }
        return node;
    }
    public void deleteFirst(int index , ListNode head){
       head = head.next;
    }
}
