// day 37 - LeetCode Problem 2181: Merge Nodes in Between Zeros

public class MergeNodeBetweenZeros {
    public ListNode mergeNodes(ListNode head) {
        ListNode ans = new ListNode(0);
        ListNode temp = ans;
        int sum = 0;
        while(head!=null){
            if(head.val==0){
                temp.next = new ListNode(sum);
                temp = temp.next;
                sum = 0;
            }
            else{
                sum+=head.val;
            }
            head = head.next;
        }
        return ans.next.next;
    }
}
