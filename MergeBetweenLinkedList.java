// Day 56 - LeetCode Problem 1669: Merge In Between Linked Lists

public class MergeBetweenLinkedList {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode aPtr = null;
        ListNode bPtr = null;
        ListNode head = list1;
        int counter = 1;
        while(list1!=null){
            if(counter==a){
                aPtr = list1;
            }
            if(counter==b){
                bPtr = list1.next;
            }
            list1 = list1.next;
            counter++;
        }
        aPtr.next = list2;
        while(list2.next!=null){
            list2 = list2.next;
        }
        list2.next = bPtr.next;
        return head;
    }
}
