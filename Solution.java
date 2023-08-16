public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = new ListNode(-1, null);
        ListNode answerPointer = answer;
        while (list1 != null || list2 != null) {
            int value = -1;
            boolean l1Chosen = false;
            boolean l2Chosen = false;
            if (list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    value = list1.val;
                    l1Chosen = true;
                } else {
                    value = list2.val;
                    l2Chosen = true;
                }
            } else if (list1 != null) {
                value = list1.val;
                l1Chosen = true;
            } else if (list2 != null) {
                value = list2.val;
                l2Chosen = true;
            }

            answerPointer.next = new ListNode(value, null);
            answerPointer = answerPointer.next;

            list1 = l1Chosen ? list1.next : list1;
            list2 = l2Chosen ? list2.next : list2;
        }
        return answer.next;
    }
}
