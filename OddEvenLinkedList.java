// Day 52 - LeetCode Problem 328: Odd Even Linked List

public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
        ListNode oddList = new ListNode();
        ListNode evenList = new ListNode();
        ListNode oddHead = oddList;
        ListNode evenHead = evenList;
        int count = 1;
        while(head!=null){
            if(count%2==1){
                oddList.next = new ListNode(head.val);
                oddList = oddList.next;
            }
            else{
                evenList.next = new ListNode(head.val);
                evenList = evenList.next;
            }
            count++;
            head = head.next;
        }
        oddList.next = evenHead.next;
        return oddHead.next;

    }
}
