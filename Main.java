public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        //System.out.println(sol.mergeTwoLists(list1, list2));

    }
    
    public static ListNode generateList(int[] values) {
        ListNode list = new ListNode(-1, null);
        ListNode listPointer = list;
        for (int val : values) {
            listPointer.next = new ListNode(val, null);
            listPointer = listPointer.next;
        }
        return list;
    }
}