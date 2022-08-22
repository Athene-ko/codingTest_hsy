public class l21 {
    ListNode result = new ListNode();
    ListNode head = result;
  
    // boolean null1 = list1 == null;
    // boolean null2 = list2 == null;
    while(!(list1 == null && list2 == null)) {
        int val1 = list1 != null ? list1.val :  101;
        int val2 = list2 != null ? list2.val : 101;
        ListNode newNode = new ListNode();
        if (val1 >= val2) {
            newNode.val = val2;
            list2 = list2.next;
        } else {
            newNode.val = val1;
            list1 = list1.next;
        }
        result.next = newNode;
        result = result.next;
    }
  
    return head.next;
}
