
//  * Definition for singly-linked list.
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum = new ListNode(0);
        ListNode curr = sum;
        int carry = 0;

        while(l1!=null || l2!=null || carry == 1){
            int s = 0;
            if(l1!=null){
                s+=l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                s+=l2.val;
                l2 = l2.next;
            }

            s+=carry;
            carry = s/10;
            ListNode node = new ListNode(s%10);
            curr.next = node;
            curr = curr.next;
        }
        return sum.next;
    }
}
