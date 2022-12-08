public class List {
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

    public void AddEnd(int data) {
        ListElement a = new ListElement();
        a.data = data;
        if (tail == null) {
            head = a;
            tail = a;
        } else {
            tail.next = a;
            tail = a;
        }
    }

    public void printList() {
        ListElement f = head;
        while (f != null) {
            System.out.print(f.data + " ");
            f = f.next;
        }
    }

}