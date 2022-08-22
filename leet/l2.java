public class l2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode head = result;
      
        int carry = 0;
        while(l1 != null || l2 != null) {
          int val1 = l1 != null ? l1.val : 0;
          int val2 = l2 != null ? l2.val : 0;
          int sum = val1 + val2 + carry;
          carry = sum >= 10 ? 1 : 0;
          sum = sum % 10;
          result.next = new ListNode(sum);
          result = result.next; // ??????
          
          l1 = l1 != null ? l1.next : null;
          l2 = l2 != null ? l2.next : null;
        }
        if (carry != 0 ) {
          result.next = new ListNode(carry);
        }
      
        return head.next;
    }
}
