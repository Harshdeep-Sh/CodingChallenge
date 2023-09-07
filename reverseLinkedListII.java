// Day 67 - LeetCode problem 92: Reverse Linked List II

public class reverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null || head.next==null){
            return head;
        }
        int[] arr = new int[right-left+1];
        int counter = 1;
        int i = 0;
        ListNode iter = head;
        while(iter!=null){
            if(counter>right){
                break;
            }
            if(counter>=left){
                arr[i] = iter.val;
                i++;
            }
            iter = iter.next;
            counter++;
        }
        iter = head;
        i = right-left;
        counter = 1;
        while(iter!=null){
            if(counter>right){
                break;
            }
            if(counter>=left){
                iter.val = arr[i];
                i--;
            }
            iter = iter.next;
            counter++;
        }
        return head;
    }
}
