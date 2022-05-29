        Problem Link:- https://leetcode.com/problems/merge-k-sorted-lists/   
           
           ******************CODE*******************
           
           
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i = 0; i < lists.length; i++){
            ListNode temp = lists[i];
            while(temp != null){
                pq.add(temp.val);
                temp = temp.next;
            }
        }
        ListNode ans = new ListNode(0);
        ListNode travers = ans;
        while(!pq.isEmpty()){
            ListNode temp = new ListNode(pq.remove());
            travers.next = temp;
            travers = travers.next;
        }
        return ans.next;
    }
}
