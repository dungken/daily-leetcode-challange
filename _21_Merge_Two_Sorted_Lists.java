public class _21_Merge_Two_Sorted_Lists {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = null;
        ListNode temp = null;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) { // Chon list1
                if (head == null) { // first time
                    head = list1;
                    temp = list1;
                } else { // not the first time
                    temp.next = list1;
                    temp = list1;
                }
                list1 = list1.next;
            } else { // Chon list2
                if (head == null) { // first time
                    head = list2;
                    temp = list2;
                } else { // not the first time
                    temp.next = list2;
                    temp = list2;
                }
                list2 = list2.next;
            }
        }

        if (list1 != null) temp.next = list1;
        if (list2 != null) temp.next = list2;
        return head;
    }


    public static void main(String[] args) {
    }
}
