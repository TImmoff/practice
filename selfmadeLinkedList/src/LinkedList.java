public class LinkedList {
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int d) {
            data = d;
            next = null;
        }

        public static LinkedList insert(LinkedList list, int d) {
            Node new_node = new Node(d);
            if (list.head == null)
                list.head = new_node;
            else {
                Node last = list.head;
                while (last.next != null) {
                    last = last.next;
                }
                last.next = new_node;
            }
            return list;
        }
    }
}