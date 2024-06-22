import java.util.PriorityQueue;

public class _23_Merge_k_Sorted_Lists_Part_3 {

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
        PriorityQueue<ListNode> queue = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val)); // min-heap
        for (ListNode ele : lists) {
            if (ele != null) queue.add(ele);
        }

        ListNode head = null;
        ListNode lastNode = null;
        while (!queue.isEmpty()) {
            ListNode curNode = queue.poll();
            if (head == null) {
                head = curNode;
            } else {
                lastNode.next = curNode;
            }
            ListNode nextNode = curNode.next;
            if(nextNode != null) queue.add(nextNode);
            lastNode = curNode;
        }
        return head;
    }


    public static void main(String[] args) {

    }
}
