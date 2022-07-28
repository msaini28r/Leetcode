class Solution {
    public ListNode reverseList(ListNode head) {
       ListNode prev=null;
        while(head!=null){
            ListNode node_next=head.next;
            head.next=prev;
            prev=head;
            head=node_next;
        }
        return prev;
    }
}