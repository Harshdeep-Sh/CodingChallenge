class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int size = 0;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        if(size<=1){
            head = null;
            return head;
        }
        if(size ==n){
            head = head.next;
            return head;
        }
        temp = head;
        for(int i = 1;i<size-n;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        return head;
    }
}
