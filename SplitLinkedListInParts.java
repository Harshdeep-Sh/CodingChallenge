// Day 66 - LeetCode Problem 725: Split Linked List in Parts

public class SplitLinkedListInParts {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        if(head==null){
            return new ListNode[k];
        }
        ListNode ptr = head;
        int len = 0;
        while(ptr!=null){
            len++;
            ptr = ptr.next;
        }
        int mod = len%k;
        ListNode temp = head;
        for (int i = 0; i < k; i++) {
            result[i] = temp;
            int currSize = len/k;
            if(mod-->0){
                currSize++;
            }
            for (int j = 0; j < currSize - 1; j++) {
                temp = temp.next;
            }
            if (temp != null) {
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }
        }
        return result;
    }
}
