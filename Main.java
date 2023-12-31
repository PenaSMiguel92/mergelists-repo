public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        ListNode list1 = generateList(new int[] { 1, 2, 4 });
        ListNode list2 = generateList(new int[] { 1, 3, 4 });
        ListNode list3 = generateList(new int[] {});
        ListNode list4 = generateList(new int[] {});
        ListNode list5 = generateList(new int[] {});
        ListNode list6 = generateList(new int[] { 0 });
        ListNode list7 = generateList(new int[] { 2, 5, 8, 12, 56, 85, 100 });
        ListNode list8 = generateList(new int[] {-24, -10, 0, 66, 89, 90, 91, 92, 93, 94, 100});
        System.out.println(printList(sol.mergeTwoLists(list1, list2)));
        System.out.println(printList(sol.mergeTwoLists(list3, list4)));
        System.out.println(printList(sol.mergeTwoLists(list5, list6)));
        System.out.println(printList(sol.mergeTwoLists(list7, list8)));

    }
    
    public static ListNode generateList(int[] values) {
        ListNode list = new ListNode(-1, null);
        ListNode listPointer = list;
        for (int val : values) {
            listPointer.next = new ListNode(val, null);
            listPointer = listPointer.next;
        }
        return list.next;
    }

    public static String printList(ListNode list) {
        String val = "[";
        while (list != null) {
            String use = list.next != null ? ", " : "";
            val += list.val + use;
            list = list.next;
        }
        val += "]";
        return val;
    }
}