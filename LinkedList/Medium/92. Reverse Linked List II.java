Problem Link:- https://leetcode.com/problems/reverse-linked-list-ii/


             ********************CODE***********************
             
               
               
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left==right)return head;
        ListNode curr=head,prev=null;
        int k=1;
        while(curr!=null&&k!=left){
            prev=curr;
            curr=curr.next;
            k++;
        }
        
        ListNode start=reverse(curr,null,curr,right,k);
        if(curr==head){
            head=start;
        }
        else prev.next=start;
        return head;
    }
    public ListNode reverse(ListNode curr,ListNode prev,ListNode start,int right,int k){
        if(k==right){
            start.next=curr.next;
            curr.next=prev;
            return curr;
        }
        ListNode next=curr.next;
        curr.next=prev;
        return reverse(next,curr,start,right,k+1);
    }
}
