// Day 49 - LeetCode Problem 86: Partition List

public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        ListNode ptr = head;
        if(head==null || head.next==null){
            return head;
        }
        ListNode low = new ListNode();
        ListNode lptr = low;
        ListNode high = new ListNode();
        ListNode hptr = high;
        while(ptr!=null){
            if(ptr.val<x){
                
                low.next = new ListNode(ptr.val);
                low = low.next;
            }
            else{
                high.next = new ListNode(ptr.val);
                high = high.next;
            }
            ptr = ptr.next;
        }
        low.next = hptr.next;
        return lptr.next;
    }
}
