// Day 57 - LeetCode Problem 142: Linked List Cycle II


public class LinkedListII {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast==slow){
                slow = head;
                while (slow != fast){
                slow = slow.next;
                fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
