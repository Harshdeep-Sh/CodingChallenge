class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

// day 31 - Leetcode Problem 61: Rotate List 

public class RotateList{
    public ListNode rotateRight(ListNode head, int k) {
        int len = 1;
        ListNode node = head;
        if(node==null){
            return head;
        }
        while(node.next!=null){
            len+=1;
            node = node.next;
        }
        k = k%len;

        if(k==0 || len<=1){
            return head;
        } 
        ListNode iter = head;
        for(int i = 0;i<len-k-1;i++){
            iter = iter.next;
        }
        node.next = head;
        head = iter.next;
        iter.next = null;
        return head;
    }
}