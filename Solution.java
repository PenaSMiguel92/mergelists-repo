public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode answer = new ListNode(-1, null);
        ListNode answerPointer = answer;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                answerPointer.next = list1;
                list1 = list1.next;
            } else {
                answerPointer.next = list2;
                list2 = list2.next;
            }
            answerPointer = answerPointer.next;
        }
        answerPointer.next = list1 == null ? list2 : list1;
        return answer.next;
    }
}
