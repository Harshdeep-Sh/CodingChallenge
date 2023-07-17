// Day 53 - LeetCode Problem 445: Add Two Numbers II

import java.util.Stack;

public class AddTwoNumbers2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> sl1 = new Stack<>();
        Stack<Integer> sl2 = new Stack<>();
        while(l1!=null){
            sl1.push(l1.val);
            l1 = l1.next;
        }
        while(l2!=null){
            sl2.push(l2.val);
            l2 = l2.next;
        }
        ListNode ans = new ListNode();
        int sum = 0;
        int carry = 0;
        while(!sl1.empty() || !sl2.empty()){
            if(!sl1.empty()){
                sum+=sl1.pop();
            }
            if(!sl2.empty()){
                sum+=sl2.pop();
            }
            sum+=carry;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            temp.next = ans;
            ans = temp;
            sum = 0;
        }
        if(carry!=0){
            ListNode temp = new ListNode(carry);
            temp.next = ans;
            ans = temp; 
        }
        ListNode temp = ans;
        while(temp.next.next!=null){
            temp = temp.next;
        }

        temp.next=null;
        return ans;

    }
}
