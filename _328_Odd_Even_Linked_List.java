public class _328_Odd_Even_Linked_List {
    public static class ListNode {
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

    public static ListNode oddEvenList(ListNode head) {
        ListNode currNode = head;
        ListNode theLastOddNode = null;
        ListNode theLastEvenNode = null;
        int index = 1;
        while(currNode != null) {
            ListNode nextNode = currNode.next;
            if(index == 1) theLastOddNode = head;
            if(index == 2) theLastEvenNode = head.next;
            if(index > 2) {
                if(index % 2 != 0) { // odd node
                    currNode.next = theLastOddNode.next;
                    theLastOddNode.next = currNode;
                    theLastEvenNode.next = nextNode;
                } else { // even node
                    theLastOddNode = theLastOddNode.next;
                    theLastEvenNode = theLastEvenNode.next;
                }
            }

            ++index;
            currNode = nextNode;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        ListNode n6 = new ListNode(6);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n6.next = null;

        oddEvenList(n1);
    }
}
