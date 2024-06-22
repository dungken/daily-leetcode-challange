import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _23_Merge_k_Sorted_Lists_Part_2 {
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


    public ListNode mergeKLists(ListNode[] lists) {
        List<ListNode> originLists = Arrays.asList(lists);
        while (originLists.size() > 1) {
            List<ListNode> resultLists = new ArrayList<>();
            for (int i = 0; i < originLists.size(); i += 2) {
                ListNode l1 = originLists.get(i);
                ListNode l2 = (i + 1) < originLists.size() ? originLists.get(i + 1) : null;
                ListNode result = mergeTwoLinkedList(l1, l2);
                resultLists.add(result);
            }
            originLists = resultLists;
        }

        return originLists.size() == 0 ? null : originLists.get(0);
    }

    private ListNode mergeTwoLinkedList(ListNode list1, ListNode list2) {
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
