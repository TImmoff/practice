public class LinkedList {
    private ListElement head;
    private ListElement tail;

    public void AddBeg(int data) {
        ListElement a = new ListElement();
        a.data = data;
        if (head == null) {
            head = a;
            tail = a;
        } else {
            a.next = head;
            head = a;
        }
    }
}