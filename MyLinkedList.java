public class MyLinkedList {
    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public static void printLinkedList(Node head) {
        if (head == null) {
            System.out.println("List is empty!");
        } else {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.value);
                temp = temp.next;
                if (temp != null) {
                    System.out.print("->");
                } else {
                    System.out.println();
                }
            }
        }
    }

    public static Node addToHead(Node head, int value) {
        Node newNode = new Node(value);
        if (head != null) {
            newNode.next = head;
        }
        return newNode;
    }

    public static Node addToTail(Node head, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            return newNode;
        } else {
            // B1: Xac dinh Last Node (last.next = NULL)
            Node lastNode = head;
            while (lastNode.next != null) {
                lastNode = lastNode.next;
            }

            // B2: Gan lastNode.next = newNode
            lastNode.next = newNode;
        }
        return head;
    }

    public static Node addToIndex(Node head, int value, int index) {
        if (index == 0) {
            return addToHead(head, value);
        } else {
            // B1: Tim vi tri index
            Node currNode = head;
            Node newNode = new Node(value);
            int count = 0;
            while (currNode != null) {
                ++count;
                if (count == index) {
                    // B2: Them vao
                    newNode.next = currNode.next;
                    currNode.next = newNode;
                    break;
                }
                currNode = currNode.next;
            }
        }
        return head;
    }

    public static Node removeAtFirst(Node head) {
        if (head != null) {
            return head.next;
        }
        return null;
    }

    public static Node removeAtLast(Node head) {
        if (head == null) {
            return null;
        }
        Node lastNode = head;
        Node prevNode = null;
        while (lastNode.next != null) {
            prevNode = lastNode;
            lastNode = lastNode.next;
        }

        if (prevNode == null) {
            return null;
        } else {
            prevNode.next = null;
        }

        return head;
    }

    public static Node removeAtIndex(Node head, int index) {
        if (head == null || index < 0) {
            return null;
        }

        if (index == 0) {
            return removeAtFirst(head);
        }

        Node currNode = head;
        Node prevNode = null;
        int count = 0;
        while (currNode != null) {
            if (count == index) {
                // Remove node
                prevNode.next = currNode.next;
            }
            prevNode = currNode;
            currNode = currNode.next;
            ++count;
        }

        return head;
    }

    public static Node reverseLinkedList(Node head) {
        Node currNode = head;
        while (currNode != null && currNode.next != null) {
            Node nextNode = currNode.next;
            currNode.next = nextNode.next;
            nextNode.next = head;
            head = nextNode;
        }
        return head;
    }


    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);
        n1 = reverseLinkedList(n1);
        printLinkedList(n1);
    }
}
